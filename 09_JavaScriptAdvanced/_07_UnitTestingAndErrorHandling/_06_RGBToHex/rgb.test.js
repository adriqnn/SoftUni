import { expect } from 'chai';
import { rgb_to_hexV1 } from './_06_RGBToHex.js';

// rgb_to_hex_testV1
describe('RGB to Hex', () => {
    it('converts black', () => {
        expect(rgb_to_hexV1(0, 0, 0)).to.equal('#000000');
    });

    it('converts white', () => {
        expect(rgb_to_hexV1(255, 255, 255)).to.equal('#FFFFFF');
    });

    it('converts SoftUni blue to #234465', () => {
        expect(rgb_to_hexV1(35, 68, 101)).to.equal('#234465');
    });

    it('returns undefined for missing params', () => {
        expect(rgb_to_hexV1(0, 0)).to.be.undefined;
        expect(rgb_to_hexV1(0)).to.be.undefined;
        expect(rgb_to_hexV1()).to.be.undefined;
    });

    it('return undefined for out of lower bounds', () => {
        expect(rgb_to_hexV1(-1, 0, 0)).to.be.undefined;
        expect(rgb_to_hexV1(0, -1, 0)).to.be.undefined;
        expect(rgb_to_hexV1(0, 0, -1)).to.be.undefined;
    });

    it('returns undefined for upper bounds', () => {
        expect(rgb_to_hexV1(256, 0, 0)).to.be.undefined;
        expect(rgb_to_hexV1(0, 256, 0)).to.be.undefined;
        expect(rgb_to_hexV1(0, 0, 256)).to.be.undefined;
    });
});

// rgb_to_hex_testV2
describe(`RGB to Hex`, () => {
    it(`valid input -> (66, 135, 245) -> #4287F5`, () => {
        expect(rgb_to_hexV1(66, 135, 245)).to.equals('#4287F5');
    });

    it(`invalid range red -> (-1, 0, 0) -> undefined`, () => {
        expect(rgb_to_hexV1(-1, 0, 0)).to.equals(undefined);
    });

    it(`invalid range green -> (0, -1, 0) -> undefined`, () => {
        expect(rgb_to_hexV1(0, 256, 0)).to.equals(undefined);
    });

    it(`invalid range blue -> (0, 0, -1) -> undefined`, () => {
        expect(rgb_to_hexV1(0, 0, -1)).to.equals(undefined);
    });

    it(`invalid range above 255 -> (256, 0, 0) -> undefined`, () => {
        expect(rgb_to_hexV1(256, 0, 0)).to.equals(undefined);
    });

    it(`more than 3 parameters -> (0, 0, 0, 0) -> undefined`, () => {
        expect(rgb_to_hexV1(0, 0, 0, 0)).to.equals('#000000');
    });

    it(`test saturation from specs -> (255, 158, 170) -> #FF9EAA`, () => {
        expect(rgb_to_hexV1(255, 158, 170)).to.equals('#FF9EAA');
    });
});

// for judge rgb_to_hex_testV1
/*
describe('RGB to Hex', () => {
    it('converts black', () => {
        expect(rgbToHexColor(0, 0, 0)).to.equal('#000000');
    });

    it('converts white', () => {
        expect(rgbToHexColor(255, 255, 255)).to.equal('#FFFFFF');
    });

    it('converts SoftUni blue to #234465', () => {
        expect(rgbToHexColor(35, 68, 101)).to.equal('#234465');
    });

    it('returns undefined for missing params', () => {
        expect(rgbToHexColor(0, 0)).to.be.undefined;
        expect(rgbToHexColor(0)).to.be.undefined;
        expect(rgbToHexColor()).to.be.undefined;
    });

    it('return undefined for out of lower bounds', () => {
        expect(rgbToHexColor(-1, 0, 0)).to.be.undefined;
        expect(rgbToHexColor(0, -1, 0)).to.be.undefined;
        expect(rgbToHexColor(0, 0, -1)).to.be.undefined;
    });

    it('returns undefined for upper bounds', () => {
        expect(rgbToHexColor(256, 0, 0)).to.be.undefined;
        expect(rgbToHexColor(0, 256, 0)).to.be.undefined;
        expect(rgbToHexColor(0, 0, 256)).to.be.undefined;
    });
});
*/

// for judge rgb_to_hex_testV2
/*
describe(`RGB to Hex`, () => {
    it(`valid input -> (66, 135, 245) -> #4287F5`, () => {
        expect(rgbToHexColor(66, 135, 245)).to.equals('#4287F5');
    });

    it(`invalid range red -> (-1, 0, 0) -> undefined`, () => {
        expect(rgbToHexColor(-1, 0, 0)).to.equals(undefined);
    });

    it(`invalid range green -> (0, -1, 0) -> undefined`, () => {
        expect(rgbToHexColor(0, 256, 0)).to.equals(undefined);
    });

    it(`invalid range blue -> (0, 0, -1) -> undefined`, () => {
        expect(rgbToHexColor(0, 0, -1)).to.equals(undefined);
    });

    it(`invalid range above 255 -> (256, 0, 0) -> undefined`, () => {
        expect(rgbToHexColor(256, 0, 0)).to.equals(undefined);
    });

    it(`more than 3 parameters -> (0, 0, 0, 0) -> undefined`, () => {
        expect(rgbToHexColor(0, 0, 0, 0)).to.equals('#000000');
    });

    it(`test saturation from specs -> (255, 158, 170) -> #FF9EAA`, () => {
        expect(rgbToHexColor(255, 158, 170)).to.equals('#FF9EAA');
    });
});
*/
