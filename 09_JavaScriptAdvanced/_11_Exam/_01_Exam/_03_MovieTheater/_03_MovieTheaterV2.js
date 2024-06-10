import { expect } from "chai";

const movie_theaterV1 = {
    ageRestrictions(movieRating){
        switch(movieRating){
            case "G":
                return "All ages admitted to watch the movie";
            case "PG":
                return "Parental guidance suggested! Some material may not be suitable for pre-teenagers";
            case "R":
                return "Restricted! Under 17 requires accompanying parent or adult guardian";
            case "NC-17":
                return "No one under 17 admitted to watch the movie";
            default:
                return "There are no age restrictions for this movie";
        }
    },
    moneySpent(tickets, food, drinks){
        if (typeof tickets !== "number" || !Array.isArray(food) || !Array.isArray(drinks)){
            throw new Error("Invalid input");
        }

        let bill = 0;
        bill += tickets * 15;

        food.forEach((element) => {
            switch(element){
                case "Nachos":
                    bill += 6;
                    break;
                case "Popcorn":
                    bill += 4.5;
                    break;
            }
        });

        drinks.forEach((element) => {
            switch(element){
                case "Soda":
                    bill += 2.5;
                    break;
                case "Water":
                    bill += 1.5;
                    break;
            }
        });

        if(bill > 50){
            bill -= bill * 0.2;
            return `The total cost for the purchase with applied discount is ${bill.toFixed(2)}`;
        } else {
            return `The total cost for the purchase is ${bill.toFixed(2)}`;
        }
    },
    reservation(rowsArray, neededSeatsCount){
        if(!Array.isArray(rowsArray) || typeof neededSeatsCount !== "number"){
            throw new Error("Invalid input");
        }

        let availableRows = [];
        rowsArray.forEach((row) => {
            if(row.freeSeats >= neededSeatsCount){
                availableRows.push(row.rowNumber);
            }
        });

        return Math.max(...availableRows);
    },
};

describe('Movie Theater', () =>{
    describe('ageRestrictions', () => {
        it('happy path', () => {
            expect(movie_theaterV1.ageRestrictions('G')).to.equal(`All ages admitted to watch the movie`);
            expect(movie_theaterV1.ageRestrictions('PG')).to.equal(`Parental guidance suggested! Some material may not be suitable for pre-teenagers`);
            expect(movie_theaterV1.ageRestrictions('R')).to.equal(`Restricted! Under 17 requires accompanying parent or adult guardian`);
            expect(movie_theaterV1.ageRestrictions('NC-17')).to.equal(`No one under 17 admitted to watch the movie`);
            expect(movie_theaterV1.ageRestrictions('zzz')).to.equal(`There are no age restrictions for this movie`);
        });
    });

    describe('moneySpent', () => {
        it('functionality', () => {
            expect(movie_theaterV1.moneySpent(10, ["Nachos"], ["Soda"])).to.equal(`The total cost for the purchase with applied discount is ${Number(126.8).toFixed(2)}`);
            // expect(movie_theaterV1.moneySpent(20, ["Nachos"], ["Soda"])).to.equal(`The total cost for the purchase with applied discount is ${Number(2).toFixed(2)}`);
            expect(movie_theaterV1.moneySpent(1, ["Nachos"], ["Soda"])).to.equal(`The total cost for the purchase is ${Number(23.5).toFixed(2)}`);
        });

        it('errors', () => {
            expect(() => movie_theaterV1.moneySpent('1', [], [])).to.throw('Invalid input');
            expect(() => movie_theaterV1.moneySpent(1, '1', [])).to.throw('Invalid input');
            expect(() => movie_theaterV1.moneySpent(1, [], '1')).to.throw('Invalid input');
            expect(() => movie_theaterV1.moneySpent('1', '1', '1')).to.throw('Invalid input');
        })
    });

    describe('reservation', function() {
        it("happy path",() => {
            expect(movie_theaterV1.reservation([{ rowNumber: 1, freeSeats: 7 }, { rowNumber: 2, freeSeats: 5 }], 2)).to.equal(2);
            expect(movie_theaterV1.reservation([{ rowNumber: 1, freeSeats: 7 }, { rowNumber: 2, freeSeats: 5 }], 7)).to.equal(1);
        });

        it("error",() => {
            expect(() => movie_theaterV1.reservation([], '1')).to.throw('Invalid input');
            expect(() => movie_theaterV1.reservation('1', 1)).to.throw('Invalid input');
            expect(() => movie_theaterV1.reservation('1', '1')).to.throw('Invalid input');
        });
    });
});