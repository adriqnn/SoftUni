import { expect } from 'chai';
import { flower_shopV1 } from "./_03_FlowersShop.js";

// flower_shop_testV1
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

// for judge flower_shop_testV1
// describe('Flowers Shop', () =>{
//     describe('calcPriceOfFlowers', () => {
//         it('happy path', () => {
//             expect(flowerShop.calcPriceOfFlowers('test', 1, 2)).to.equal(`You need $${Number(2).toFixed(2)} to buy test!`);
//         });
//
//         it('errors', () => {
//             expect(() => flowerShop.calcPriceOfFlowers(1, 1, 2)).to.throw('Invalid input!');
//             expect(() => flowerShop.calcPriceOfFlowers('test', 'test', 2)).to.throw('Invalid input!');
//             expect(() => flowerShop.calcPriceOfFlowers('test', 1, 'test')).to.throw('Invalid input!');
//         })
//     });
//
//     describe('checkFlowersAvailable', () => {
//         it('functionality', () => {
//             expect(flowerShop.checkFlowersAvailable('test', ['one', 'test', 'two'])).to.equal('The test are available!');
//             expect(flowerShop.checkFlowersAvailable('test', ['test', 'one', 'two'])).to.equal('The test are available!');
//             expect(flowerShop.checkFlowersAvailable('test', ['one', 'two', 'three'])).to.equal('The test are sold! You need to purchase more!');
//         });
//     });
//
//     describe('sellFlowers', function() {
//         it("happy path",() => {
//             expect(flowerShop.sellFlowers(["Rose", "Lily", "Orchid"], 1)).to.equal('Rose / Orchid');
//             expect(flowerShop.sellFlowers(["Rose", "Lily", "Orchid"], 2)).to.equal('Rose / Lily');
//         });
//
//         it("error",() => {
//             expect(() => flowerShop.sellFlowers(['one', 'test', 'two'], '1')).to.throw('Invalid input!');
//             expect(() => flowerShop.sellFlowers(2, 2)).to.throw('Invalid input!');
//             expect(() => flowerShop.sellFlowers(['one', 'test', 'two'], -1)).to.throw('Invalid input!');
//         });
//     });
// });