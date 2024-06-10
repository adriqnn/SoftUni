import {expect} from "chai";

const flower_shopV1 = {
    calcPriceOfFlowers(flower, price, quantity){
        if (typeof flower != 'string' || !Number.isInteger(price) || !Number.isInteger(quantity)){
            throw new Error('Invalid input!');
        } else {
            let result = price * quantity;
            return `You need $${result.toFixed(2)} to buy ${flower}!`;
        }
    },
    checkFlowersAvailable(flower, gardenArr){
        if (gardenArr.indexOf(flower) >= 0){
            return `The ${flower} are available!`;
        } else {
            return `The ${flower} are sold! You need to purchase more!`;
        }
    },
    sellFlowers(gardenArr, space){
        let shop = [];
        let i = 0;

        if (!Array.isArray(gardenArr) || !Number.isInteger(space) || space < 0 || space >= gardenArr.length){
            throw new Error('Invalid input!');
        } else {
            while (gardenArr.length > i){
                if (i !== space) {
                    shop.push(gardenArr[i]);
                }

                i++
            }
        }

        return shop.join(' / ');
    }
}

describe('Flowers Shop', () =>{
    describe('calcPriceOfFlowers', () => {
        it('happy path', () => {
            expect(flower_shopV1.calcPriceOfFlowers('test', 1, 2)).to.equal(`You need $${Number(2).toFixed(2)} to buy test!`);
        });

        it('errors', () => {
            expect(() => flower_shopV1.calcPriceOfFlowers(1, 1, 2)).to.throw('Invalid input!');
            expect(() => flower_shopV1.calcPriceOfFlowers('test', 'test', 2)).to.throw('Invalid input!');
            expect(() => flower_shopV1.calcPriceOfFlowers('test', 1, 'test')).to.throw('Invalid input!');
        })
    });

    describe('checkFlowersAvailable', () => {
        it('functionality', () => {
            expect(flower_shopV1.checkFlowersAvailable('test', ['one', 'test', 'two'])).to.equal('The test are available!');
            expect(flower_shopV1.checkFlowersAvailable('test', ['test', 'one', 'two'])).to.equal('The test are available!');
            expect(flower_shopV1.checkFlowersAvailable('test', ['one', 'two', 'three'])).to.equal('The test are sold! You need to purchase more!');
        });
    });

    describe('sellFlowers', function() {
        it("happy path",() => {
            expect(flower_shopV1.sellFlowers(["Rose", "Lily", "Orchid"], 1)).to.equal('Rose / Orchid');
            expect(flower_shopV1.sellFlowers(["Rose", "Lily", "Orchid"], 2)).to.equal('Rose / Lily');
        });

        it("error",() => {
            expect(() => flower_shopV1.sellFlowers(['one', 'test', 'two'], '1')).to.throw('Invalid input!');
            expect(() => flower_shopV1.sellFlowers(2, 2)).to.throw('Invalid input!');
            expect(() => flower_shopV1.sellFlowers(['one', 'test', 'two'], -1)).to.throw('Invalid input!');
        });
    });
});