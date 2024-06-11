import { expect } from 'chai';
import { wedding_dayV1 } from "./_03_WeddingDay.js";

// wedding_day_testV1
describe('Wedding Day', () =>{
    describe('pickVenue', () => {
        it('functionality', () => {
            expect(wedding_dayV1.pickVenue(150, 122, 'Varna')).to.equal(`This venue does not meet your requirements!`);
            expect(wedding_dayV1.pickVenue(150, 120, 'Varna')).to.equal(`This venue meets the requirements, with capacity of 150 guests and 120$ cover.`);
            expect(wedding_dayV1.pickVenue(151, 119, 'Varna')).to.equal(`This venue meets the requirements, with capacity of 151 guests and 119$ cover.`);
            expect(wedding_dayV1.pickVenue(149, 120, 'Varna')).to.equal(`This venue does not meet your requirements!`);
        });

        it('error', () => {
            expect(() => wedding_dayV1.pickVenue('hello', 'hello', 'hello')).to.throw('Invalid Information!');
            expect(() => wedding_dayV1.pickVenue(9, 'hello', 9)).to.throw('Invalid Information!');
            expect(() => wedding_dayV1.pickVenue('hello', 9)).to.throw('Invalid Information!');
            expect(() => wedding_dayV1.pickVenue('9', 9, 'hello')).to.throw('Invalid Information!');
            expect(() => wedding_dayV1.pickVenue(9, 9, 'Sofia')).to.throw(`The location of this venue is not in the correct area!`);
        });
    });

    describe('otherSpendings', () => {
        it('functionality', () => {
            expect(wedding_dayV1.otherSpendings(['flowers', 'Fabric drapes and curtains'], ['pictures', 'video'], true)).to.equal('You spend 2465$ for wedding decoration and photography with 15% discount!');
            expect(wedding_dayV1.otherSpendings(['flowers'], ['pictures'], true)).to.equal('You spend 1020$ for wedding decoration and photography with 15% discount!');
            expect(wedding_dayV1.otherSpendings(['flowers'], ['pictures'], false)).to.equal('You spend 1200$ for wedding decoration and photography!');
            expect(wedding_dayV1.otherSpendings(['flowers'], ['pictures'], false)).to.equal('You spend 1200$ for wedding decoration and photography!');
        });

        it('error', () => {
            expect(() => wedding_dayV1.otherSpendings('hello', 'hello', 'hello')).to.throw('Invalid Information!');
            expect(() => wedding_dayV1.otherSpendings(9, 'hello', 9)).to.throw('Invalid Information!');
            expect(() => wedding_dayV1.otherSpendings('hello', 9)).to.throw('Invalid Information!');
        });
    });

    describe('tableDistribution', () => {
        it('error', () => {
            expect(() => wedding_dayV1.tableDistribution(-8, 0)).to.throw('Invalid Information!');
            expect(() => wedding_dayV1.tableDistribution(0, -8)).to.throw('Invalid Information!');
            expect(() => wedding_dayV1.tableDistribution('hello', 9)).to.throw('Invalid Information!');
            expect(() => wedding_dayV1.tableDistribution('hello', [])).to.throw('Invalid Information!');
        });
    });
});

// for judge wedding_day_testV1
// describe('Wedding Day', () =>{
//     describe('pickVenue', () => {
//         it('functionality', () => {
//             expect(weddingDay.pickVenue(150, 122, 'Varna')).to.equal(`This venue does not meet your requirements!`);
//             expect(weddingDay.pickVenue(150, 120, 'Varna')).to.equal(`This venue meets the requirements, with capacity of 150 guests and 120$ cover.`);
//             expect(weddingDay.pickVenue(151, 119, 'Varna')).to.equal(`This venue meets the requirements, with capacity of 151 guests and 119$ cover.`);
//             expect(weddingDay.pickVenue(149, 120, 'Varna')).to.equal(`This venue does not meet your requirements!`);
//         });
//
//         it('error', () => {
//             expect(() => weddingDay.pickVenue('hello', 'hello', 'hello')).to.throw('Invalid Information!');
//             expect(() => weddingDay.pickVenue(9, 'hello', 9)).to.throw('Invalid Information!');
//             expect(() => weddingDay.pickVenue('hello', 9)).to.throw('Invalid Information!');
//             expect(() => weddingDay.pickVenue('9', 9, 'hello')).to.throw('Invalid Information!');
//             expect(() => weddingDay.pickVenue(9, 9, 'Sofia')).to.throw(`The location of this venue is not in the correct area!`);
//         });
//     });
//
//     describe('otherSpendings', () => {
//         it('functionality', () => {
//             expect(weddingDay.otherSpendings(['flowers', 'Fabric drapes and curtains'], ['pictures', 'video'], true)).to.equal('You spend 2465$ for wedding decoration and photography with 15% discount!');
//             expect(weddingDay.otherSpendings(['flowers'], ['pictures'], true)).to.equal('You spend 1020$ for wedding decoration and photography with 15% discount!');
//             expect(weddingDay.otherSpendings(['flowers'], ['pictures'], false)).to.equal('You spend 1200$ for wedding decoration and photography!');
//             expect(weddingDay.otherSpendings(['flowers'], ['pictures'], false)).to.equal('You spend 1200$ for wedding decoration and photography!');
//         });
//
//         it('error', () => {
//             expect(() => weddingDay.otherSpendings('hello', 'hello', 'hello')).to.throw('Invalid Information!');
//             expect(() => weddingDay.otherSpendings(9, 'hello', 9)).to.throw('Invalid Information!');
//             expect(() => weddingDay.otherSpendings('hello', 9)).to.throw('Invalid Information!');
//         });
//     });
//
//     describe('tableDistribution', () => {
//         it('error', () => {
//             expect(() => weddingDay.tableDistribution(-8, 0)).to.throw('Invalid Information!');
//             expect(() => weddingDay.tableDistribution(0, -8)).to.throw('Invalid Information!');
//             expect(() => weddingDay.tableDistribution('hello', 9)).to.throw('Invalid Information!');
//             expect(() => weddingDay.tableDistribution('hello', [])).to.throw('Invalid Information!');
//         });
//     });
// });