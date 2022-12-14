const {expect} = require('chai');
const {rgbToHexColor} = require('./rgb');

describe('RGBtoHexColor', () => {
    it('converts black', () => {
        expect(rgbToHexColor(0,0,0)).to.equal('#000000');
    });
    it('converts white', () => {
        expect(rgbToHexColor(255,255,255)).to.equal('#FFFFFF');
    });
    it('converts SoftUni blue to #234465', () => {
        expect(rgbToHexColor(35,68,101)).to.equal('#234465');
    });
    it('returns undefined for missing params', () => {
        expect(rgbToHexColor(0,0)).to.be.undefined;
        expect(rgbToHexColor(0)).to.be.undefined;
        expect(rgbToHexColor()).to.be.undefined;
    });
    it('return undefined for out of lower bounds', () => {
        expect(rgbToHexColor(-1,0,0)).to.be.undefined;
        expect(rgbToHexColor(0,-1,0)).to.be.undefined;
        expect(rgbToHexColor(0,0,-1)).to.be.undefined;
    })
    it('returns undefined for upper bounds', () => {
        expect(rgbToHexColor(256,0,0)).to.be.undefined;
        expect(rgbToHexColor(0,256,0)).to.be.undefined;
        expect(rgbToHexColor(0,0,256)).to.be.undefined;
    })
});