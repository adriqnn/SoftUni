const{expect} = require('chai');
const {movieTheater} = require('./solution');


describe('Test', () =>{
    describe('ageRestrictions', () => {
        it('happy path', () => {
            expect(movieTheater.ageRestrictions('G')).to.equal(`All ages admitted to watch the movie`);
            expect(movieTheater.ageRestrictions('PG')).to.equal(`Parental guidance suggested! Some material may not be suitable for pre-teenagers`);
            expect(movieTheater.ageRestrictions('R')).to.equal(`Restricted! Under 17 requires accompanying parent or adult guardian`);
            expect(movieTheater.ageRestrictions('NC-17')).to.equal(`No one under 17 admitted to watch the movie`);
            expect(movieTheater.ageRestrictions('zzz')).to.equal(`There are no age restrictions for this movie`);

        });
    });

    describe('moneySpent', () => {
        it('functionality', () => {
            expect(movieTheater.moneySpent(10,["Nachos"],["Soda"])).to.equal(`The total cost for the purchase with applied discount is ${Number(126.8).toFixed(2)}`);
            // expect(movieTheater.moneySpent(20,["Nachos"],["Soda"])).to.equal(`The total cost for the purchase with applied discount is ${Number(2).toFixed(2)}`);
            expect(movieTheater.moneySpent(1,["Nachos"],["Soda"])).to.equal(`The total cost for the purchase is ${Number(23.5).toFixed(2)}`);
        });

        it('errors', () => {
            expect(() => movieTheater.moneySpent('1',[],[])).to.throw('Invalid input');
            expect(() => movieTheater.moneySpent(1,'1',[])).to.throw('Invalid input');
            expect(() => movieTheater.moneySpent(1,[],'1')).to.throw('Invalid input');
            expect(() => movieTheater.moneySpent('1','1','1')).to.throw('Invalid input');
        })
    });

    describe('reservation', function() {
        it("happy path",() => {
            expect(movieTheater.reservation([{rowNumber: 1, freeSeats: 7 }, { rowNumber: 2, freeSeats: 5 }], 2)).to.equal(2);
            expect(movieTheater.reservation([{ rowNumber: 1, freeSeats: 7 }, { rowNumber: 2, freeSeats: 5 }], 7)).to.equal(1);
        });
        it("error",() => {
            expect(() => movieTheater.reservation([], '1')).to.throw('Invalid input');
            expect(() => movieTheater.reservation('1', 1)).to.throw('Invalid input');
            expect(() => movieTheater.reservation('1', '1')).to.throw('Invalid input');  
        });
    });
});

