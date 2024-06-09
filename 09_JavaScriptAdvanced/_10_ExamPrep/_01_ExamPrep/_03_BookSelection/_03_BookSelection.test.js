import { expect } from "chai";
import { book_selectionV1 } from "./_03_BookSelection.js";

// book_selection_testV1
describe('Book Selection', () => {
    describe('isGenreSuitable', () => {
        it('happy path', () => {
            expect(book_selectionV1.isGenreSuitable('Thriller', 20)).to.equal('Those books are suitable');
            expect(book_selectionV1.isGenreSuitable('Horror', 20)).to.equal('Those books are suitable');
            expect(book_selectionV1.isGenreSuitable('a', 20)).to.equal('Those books are suitable');
            expect(book_selectionV1.isGenreSuitable('a', 10)).to.equal('Those books are suitable');
        });

        it('inappropriate genre for the age', () => {
            expect(book_selectionV1.isGenreSuitable('Thriller', 10)).to.equal('Books with Thriller genre are not suitable for kids at 10 age');
            expect(book_selectionV1.isGenreSuitable('Horror', 10)).to.equal('Books with Horror genre are not suitable for kids at 10 age');
        });

        it('inappropriate genre for the age, edge case', () => {
            expect(book_selectionV1.isGenreSuitable('Thriller', 12)).to.equal('Books with Thriller genre are not suitable for kids at 12 age');
            expect(book_selectionV1.isGenreSuitable('Horror', 12)).to.equal('Books with Horror genre are not suitable for kids at 12 age');
        });
    });

    describe('isItAffordable', () => {
        it('happy path', () => {
            expect(book_selectionV1.isItAffordable(1, 2)).to.equal('Book bought. You have 1$ left');
        });

        it('happy path, edge case', () => {
            expect(book_selectionV1.isItAffordable(1, 1)).to.equal('Book bought. You have 0$ left');
        });

        it('not enough money', () => {
            expect(book_selectionV1.isItAffordable(2, 1)).to.equal('You don\'t have enough money');
        });

        it('invalid input', () => {
            expect(() => book_selectionV1.isItAffordable('1', 1)).to.throw();
            expect(() => book_selectionV1.isItAffordable(1, '1')).to.throw();
            expect(() => book_selectionV1.isItAffordable('1', '1')).to.throw();
        });
    });

    describe('suitableTitles', () => {
        it('happy path, single match', () => {
            expect(book_selectionV1.suitableTitles([{title:'aa', genre:'a'}], 'a')).to.deep.equal(['aa']);
        });

        it('happy path, tow match', () => {
            expect(book_selectionV1.suitableTitles([{title:'aa', genre:'a'}, {title:'ab', genre:'a'}, {title:'bb', genre:'b'}],'a')).to.deep.equal(['aa', 'ab']);
        });

        it('no match', () => {
            expect(book_selectionV1.suitableTitles([{title:'bb', genre:'b'}], 'a')).to.deep.equal([]);
        })

        it('invalid input', () => {
            expect(() => book_selectionV1.suitableTitles('aabb', 'a')).to.throw();
        });

        it('invalid input', () => {
            expect(() => book_selectionV1.suitableTitles([{title:'aa', genre:'5'}], 5)).to.throw();
        });
    });
});

// for judge book_selection_testV1
// describe('Book Selection', () => {
//     describe('isGenreSuitable', () => {
//         it('happy path', () => {
//             expect(bookSelection.isGenreSuitable('Thriller', 20)).to.equal('Those books are suitable');
//             expect(bookSelection.isGenreSuitable('Horror', 20)).to.equal('Those books are suitable');
//             expect(bookSelection.isGenreSuitable('a', 20)).to.equal('Those books are suitable');
//             expect(bookSelection.isGenreSuitable('a', 10)).to.equal('Those books are suitable');
//         });
//
//         it('inappropriate genre for the age', () => {
//             expect(bookSelection.isGenreSuitable('Thriller', 10)).to.equal('Books with Thriller genre are not suitable for kids at 10 age');
//             expect(bookSelection.isGenreSuitable('Horror', 10)).to.equal('Books with Horror genre are not suitable for kids at 10 age');
//         });
//
//         it('inappropriate genre for the age, edge case', () => {
//             expect(bookSelection.isGenreSuitable('Thriller', 12)).to.equal('Books with Thriller genre are not suitable for kids at 12 age');
//             expect(bookSelection.isGenreSuitable('Horror', 12)).to.equal('Books with Horror genre are not suitable for kids at 12 age');
//         });
//     });
//
//     describe('isItAffordable', () => {
//         it('happy path', () => {
//             expect(bookSelection.isItAffordable(1, 2)).to.equal('Book bought. You have 1$ left');
//         });
//
//         it('happy path, edge case', () => {
//             expect(bookSelection.isItAffordable(1, 1)).to.equal('Book bought. You have 0$ left');
//         });
//
//         it('not enough money', () => {
//             expect(bookSelection.isItAffordable(2, 1)).to.equal('You don\'t have enough money');
//         });
//
//         it('invalid input', () => {
//             expect(() => bookSelection.isItAffordable('1', 1)).to.throw();
//             expect(() => bookSelection.isItAffordable(1, '1')).to.throw();
//             expect(() => bookSelection.isItAffordable('1', '1')).to.throw();
//         });
//     });
//
//     describe('suitableTitles', () => {
//         it('happy path, single match', () => {
//             expect(bookSelection.suitableTitles([{title:'aa', genre:'a'}], 'a')).to.deep.equal(['aa']);
//         });
//
//         it('happy path, tow match', () => {
//             expect(bookSelection.suitableTitles([{title:'aa', genre:'a'}, {title:'ab', genre:'a'}, {title:'bb', genre:'b'}],'a')).to.deep.equal(['aa', 'ab']);
//         });
//
//         it('no match', () => {
//             expect(bookSelection.suitableTitles([{title:'bb', genre:'b'}], 'a')).to.deep.equal([]);
//         })
//
//         it('invalid input', () => {
//             expect(() => bookSelection.suitableTitles('aabb', 'a')).to.throw();
//         });
//
//         it('invalid input', () => {
//             expect(() => bookSelection.suitableTitles([{title:'aa', genre:'5'}], 5)).to.throw();
//         });
//     });
// });