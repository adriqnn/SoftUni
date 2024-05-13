function city_taxesV1(name, population, treasury){
    const result = {
        name,
        population,
        treasury,
        taxRate: 10,
        collectTaxes(){
            this.treasury += Math.floor(this.population * this.taxRate);
        },
        applyGrowth(percent){
            this.population += Math.floor(this.population * percent / 100);
        },
        applyRecession(percent){
            this.treasury -= Math.floor(this.treasury * percent / 100);
        }
    }

    return result;
}

function city_taxesV2(name, population, treasury){
    return {
        name,
        population,
        treasury,
        taxRate: 10,
        collectTaxes(){
            this.treasury += Math.floor(this.population * this.taxRate);
        },
        applyGrowth(percent){
            this.population += Math.floor(this.population * percent / 100);
        },
        applyRecession(percent){
            this.treasury -= Math.floor(this.treasury * percent / 100);
        }
    }
}

function city_taxesV3(name, population, treasury){
    class City{
        constructor(name, population, treasury) {
            this.name = name;
            this.population = population;
            this.treasury = treasury;
            this.taxRate = 10;
        }

        collectTaxes = () => this.treasury += Math.floor(this.population * this.taxRate);
        applyGrowth= (percent) => this.population += Math.floor(this.population * percent / 100);
        applyRecession= (percent) => this.treasury -= Math.floor(this.treasury * percent / 100);
    }

    return new City(name, population, treasury);
}
