function balloonsV1(){
    class Balloon{
        constructor(color, hasWeight){
            this.color = color;
            this.hasWeight = hasWeight;
        }
    }

    class PartyBalloon extends Balloon{
        constructor(color, hasWeight, ribbonColor, ribbonLength){
            super(color, hasWeight)
            this.ribbonColor = ribbonColor;
            this.ribbonLength = ribbonLength;
            this._ribbon = {color: ribbonColor, length: ribbonLength};
        }

        get ribbon(){
            return this._ribbon;
        }
    }

    class BirthdayBalloon extends PartyBalloon{
        constructor(color, hasWeight, ribbonColor, ribbonLength, text){
            super(color, hasWeight, ribbonColor, ribbonLength);
            this._text = text;
        }

        get text(){
            return this._text;
        }
    }

    return {
        Balloon,
        PartyBalloon,
        BirthdayBalloon
    }
}

// for judge with the mistake in tests
function balloonsV2(){
    class Balloon{
        constructor(color, hasWeight){
            this.color = color;
            this.hasWeight = hasWeight;
            this.gasWeight = hasWeight;
        }
    }

    class PartyBalloon extends Balloon{
        constructor(color, hasWeight, ribbonColor, ribbonLength){
            super(color, hasWeight)
            this.ribbonColor = ribbonColor;
            this.ribbonLength = ribbonLength;
            this._ribbon = {color: ribbonColor, length: ribbonLength};
        }

        get ribbon(){
            return this._ribbon;
        }
    }

    class BirthdayBalloon extends PartyBalloon{
        constructor(color, hasWeight, ribbonColor, ribbonLength, text){
            super(color, hasWeight, ribbonColor, ribbonLength);
            this._text = text;
        }

        get text(){
            return this._text;
        }
    }

    return {
        Balloon,
        PartyBalloon,
        BirthdayBalloon
    }
}
