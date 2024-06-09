import { expect } from "chai";

const rentCarV1 = {
    searchCar(shop, model){
        let findModel = [];
        if (Array.isArray(shop) && typeof model == 'string'){
            for (let i = 0; i < shop.length; i++){
                if (model === shop[i]) {
                    findModel.push(shop[i]);
                }
            }

            if (findModel.length !== 0){
                return `There is ${findModel.length} car of model ${model} in the catalog!`;
            } else {
                throw new Error('There are no such models in the catalog!');
            }
        } else {
            throw new Error('Invalid input!');
        }
    },
    calculatePriceOfCar (model, days){
        let catalogue = {
            Volkswagen: 20,
            Audi: 36,
            Toyota: 40,
            BMW: 45,
            Mercedes: 50
        };

        if (typeof model == 'string' && Number.isInteger(days)){
            if (catalogue.hasOwnProperty(model)){
                let cost = catalogue[model] * days;
                return `You choose ${model} and it will cost $${cost}!`;
            } else {
                throw new Error('No such model in the catalog!');
            }
        } else {
            throw new Error('Invalid input!');
        }
    },
    checkBudget(costPerDay, days, budget) {
        if (!Number.isInteger(costPerDay) || !Number.isInteger(days) || !Number.isInteger(budget)) {
            throw new Error('Invalid input!');
        } else {
            let cost = costPerDay * days;
            if (cost <= budget) {
                return `You rent a car!`
            } else {
                return 'You need a bigger budget!'
            }
        }
    }
}

describe('Rent Car', () =>{
    describe('searchCar', () => {
        it('happy path', () => {
            expect(rentCarV1.searchCar(['test', 'test2', 'test3'], 'test')).to.equal('There is 1 car of model test in the catalog!');
            expect(rentCarV1.searchCar(['test', 'test', 'test3'], 'test')).to.equal('There is 2 car of model test in the catalog!');
            expect(rentCarV1.searchCar(['test', 'test', 'test'], 'test')).to.equal('There is 3 car of model test in the catalog!');
            expect(() => rentCarV1.searchCar(['test1', 'test2', 'test3'], 'test')).to.throw('There are no such models in the catalog!');
        });

        it('errors', () => {
            expect(() => rentCarV1.searchCar([], 'test')).to.throw('There are no such models in the catalog!');
            expect(() => rentCarV1.searchCar(1, 'test')).to.throw('Invalid input!');
            expect(() => rentCarV1.searchCar('test', 'test')).to.throw('Invalid input!');
            expect(() => rentCarV1.searchCar({}, 'test')).to.throw('Invalid input!');
            expect(() => rentCarV1.searchCar(['test', 'test2', 'test3'], 1)).to.throw('Invalid input!');
            expect(() => rentCarV1.searchCar(['test', 'test2', 'test3'], {})).to.throw('Invalid input!');
            expect(() => rentCarV1.searchCar(['test', 'test2', 'test3'], [])).to.throw('Invalid input!');
            expect(() => rentCarV1.searchCar(['test', 'test2', 'test3'], '')).to.throw('There are no such models in the catalog!');
        })
    });

    describe('calculatePriceOfCar', () => {
        it('functionality', () => {
            expect(rentCarV1.calculatePriceOfCar('Audi', 10)).to.equal('You choose Audi and it will cost $360!');
            expect(() => rentCarV1.calculatePriceOfCar('whatever', 10)).to.throw('No such model in the catalog!');
        });

        it('error', () => {
            expect(() => rentCarV1.calculatePriceOfCar(1, 1)).to.throw('Invalid input!');
            expect(() => rentCarV1.calculatePriceOfCar(1, "1")).to.throw('Invalid input!');
            expect(() => rentCarV1.calculatePriceOfCar({}, [])).to.throw('Invalid input!');
            expect(() => rentCarV1.calculatePriceOfCar([], 1)).to.throw('Invalid input!');
            expect(() => rentCarV1.calculatePriceOfCar('test', {})).to.throw('Invalid input!');
            expect(() => rentCarV1.calculatePriceOfCar('test', [])).to.throw('Invalid input!');

        });
    });

    describe('checkBudget', function() {
        it("happy path",() => {
            expect(rentCarV1.checkBudget(5, 5, 100)).to.equal('You rent a car!');
            expect(rentCarV1.checkBudget(5, 1, 5)).to.equal('You rent a car!');
        });

        it("bigger budget",() => {
            expect(rentCarV1.checkBudget(3, 3, 0)).to.equal('You need a bigger budget!');
        });
    });
});