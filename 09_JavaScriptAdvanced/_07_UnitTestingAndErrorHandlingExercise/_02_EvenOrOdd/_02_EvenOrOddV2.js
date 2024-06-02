import { expect } from 'chai';

function even_or_oddV1(string) {
    if (typeof(string) !== 'string') {
        return undefined;
    }

    if (string.length % 2 === 0) {
        return "even";
    }

    return "odd";
}

describe('Even or Odd', () => {
    it('should be undefined if number', () => {
        expect(even_or_oddV1(2)).to.be.undefined;
    });

    it('should be undefined if array', () => {
        expect(even_or_oddV1([])).to.be.undefined;
    });

    it('should be undefined if object', () => {
        expect(even_or_oddV1({})).to.be.undefined;
    });

    it('should return odd if string is odd', () => {
        expect(even_or_oddV1('hi!')).to.equal('odd');
    });

    it('should return even if string is even', () => {
        expect(even_or_oddV1('hi')).to.equal('even');
    });
});
