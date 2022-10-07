const{expect} = require('chai');
const {rentCar} = require('./solution');

describe('Test', () =>{
    describe('searchCar', () => {
        it('happy path', () => {
            expect(rentCar.searchCar(['test', 'test2', 'test3'], 'test')).to.equal('There is 1 car of model test in the catalog!');
            expect(rentCar.searchCar(['test', 'test', 'test3'], 'test')).to.equal('There is 2 car of model test in the catalog!');
            expect(rentCar.searchCar(['test', 'test', 'test'], 'test')).to.equal('There is 3 car of model test in the catalog!');
            expect(() => rentCar.searchCar(['test1', 'test2', 'test3'], 'test')).to.throw('There are no such models in the catalog!');
        });
        it('errors', () => {
            expect(() => rentCar.searchCar([], 'test')).to.throw('There are no such models in the catalog!');
            expect(() => rentCar.searchCar(1, 'test')).to.throw('Invalid input!');
            expect(() => rentCar.searchCar('test', 'test')).to.throw('Invalid input!');
            expect(() => rentCar.searchCar({}, 'test')).to.throw('Invalid input!');
            expect(() => rentCar.searchCar(['test', 'test2', 'test3'], 1)).to.throw('Invalid input!');
            expect(() => rentCar.searchCar(['test', 'test2', 'test3'], {})).to.throw('Invalid input!');
            expect(() => rentCar.searchCar(['test', 'test2', 'test3'], [])).to.throw('Invalid input!');
            expect(() => rentCar.searchCar(['test', 'test2', 'test3'], '')).to.throw('There are no such models in the catalog!');
        })
    });

    describe('calculatePriceOfCar', () => {
        it('functionality', () => {
            expect(rentCar.calculatePriceOfCar('Audi', 10)).to.equal('You choose Audi and it will cost $360!');
            expect(() => rentCar.calculatePriceOfCar('whatever', 10)).to.throw('No such model in the catalog!');
        });
        it('error', () => {
            expect(() => rentCar.calculatePriceOfCar(1,1)).to.throw('Invalid input!');
            expect(() => rentCar.calculatePriceOfCar(1,"1")).to.throw('Invalid input!');
            expect(() => rentCar.calculatePriceOfCar({},[])).to.throw('Invalid input!');
            expect(() => rentCar.calculatePriceOfCar([],1)).to.throw('Invalid input!');
            expect(() => rentCar.calculatePriceOfCar('test',{})).to.throw('Invalid input!');
            expect(() => rentCar.calculatePriceOfCar('test',[])).to.throw('Invalid input!');
        
        });
    });

    describe('checkBudget', function() {
        it("happy path",() => {
            expect(rentCar.checkBudget(5,5,100)).to.equal('You rent a car!');
            expect(rentCar.checkBudget(5,1,5)).to.equal('You rent a car!');
        });
        it("bigger budget",() => {
            expect(rentCar.checkBudget(3,3,0)).to.equal('You need a bigger budget!');
        });
    });
});