import { expect } from "chai";

const company_administrationV1 = {
    hiringEmployee(name, position, yearsExperience){
        if (position === "Programmer"){
            if (yearsExperience >= 3){
                return `${name} was successfully hired for the position ${position}.`;
            } else {
                return `${name} is not approved for this position.`;
            }
        }

        throw new Error(`We are not looking for workers for this position.`);
    },
    calculateSalary(hours){
        let payPerHour = 15;
        let totalAmount = payPerHour * hours;

        if (typeof hours !== "number" || hours < 0){
            throw new Error("Invalid hours");
        } else if (hours > 160) {
            totalAmount += 1000;
        }

        return totalAmount;
    },
    firedEmployee(employees, index){
        let result = [];

        if (!Array.isArray(employees) || !Number.isInteger(index) || index < 0 || index >= employees.length){
            throw new Error("Invalid input");
        }

        for (let i = 0; i < employees.length; i++){
            if (i !== index) {
                result.push(employees[i]);
            }
        }

        return result.join(", ");
    }
}

describe('Company Administration', () => {
    describe('hiringEmployee', () => {
        it('happy path', () => {
            expect(company_administrationV1.hiringEmployee('A', 'Programmer', 3)).to.equal('A was successfully hired for the position Programmer.');
            expect(company_administrationV1.hiringEmployee('A', 'Programmer', 4)).to.equal('A was successfully hired for the position Programmer.');
            expect(company_administrationV1.hiringEmployee('A', 'Programmer', 2)).to.equal('A is not approved for this position.');
        });

        it('expect error', () => {
            expect(() => company_administrationV1.hiringEmployee('A', 'A', 1)).to.throw('We are not looking for workers for this position.');
        });
    });

    describe('calculateSalary', () => {
        it('happy path', () => {
            expect(company_administrationV1.calculateSalary(1)).to.equal(15);
            expect(company_administrationV1.calculateSalary(160)).to.equal(2400);
            expect(company_administrationV1.calculateSalary(161)).to.equal(3415);
        });

        it('expect error', () => {
            expect(() => company_administrationV1.calculateSalary('1')).to.throw("Invalid hours");
            expect(() => company_administrationV1.calculateSalary(-1)).to.throw("Invalid hours");
            expect(() => company_administrationV1.calculateSalary([])).to.throw("Invalid hours");
            expect(() => company_administrationV1.calculateSalary(null)).to.throw("Invalid hours");
            expect(() => company_administrationV1.calculateSalary(undefined)).to.throw("Invalid hours");
        });
    });

    describe('firedEmployee', () => {
        it('happy path', () => {
            expect(company_administrationV1.firedEmployee(["petar", "ivan"], 0)).to.equal("ivan");
            expect(company_administrationV1.firedEmployee(["petar", "ivan", "petkan"], 0)).to.equal("ivan, petkan");
        });

        it('expect error', () => {
            expect(() => company_administrationV1.firedEmployee('1', '1')).to.throw("Invalid input");
            expect(() => company_administrationV1.firedEmployee(1, '1')).to.throw("Invalid input");
            expect(() => company_administrationV1.firedEmployee('1', 1)).to.throw("Invalid input");
            expect(() => company_administrationV1.firedEmployee(['petar', 'ivan'],-1)).to.throw("Invalid input");
            expect(() => company_administrationV1.firedEmployee(['petar', 'ivan'],30)).to.throw("Invalid input");
            expect(() => company_administrationV1.firedEmployee({}, {})).to.throw("Invalid input");
            expect(() => company_administrationV1.firedEmployee({}, 1)).to.throw("Invalid input");
            expect(() => company_administrationV1.firedEmployee(1, {})).to.throw("Invalid input");
            expect(() => company_administrationV1.firedEmployee([], 1)).to.throw("Invalid input");
            expect(() => company_administrationV1.firedEmployee(['petar', 'ivan'],null)).to.throw("Invalid input");
            expect(() => company_administrationV1.firedEmployee(1, 1)).to.throw("Invalid input");
            expect(() => company_administrationV1.firedEmployee([], '1')).to.throw("Invalid input");
            expect(() => company_administrationV1.firedEmployee([], -1)).to.throw("Invalid input");
            expect(() => company_administrationV1.firedEmployee(['petar'], 1)).to.throw("Invalid input");
            expect(() => company_administrationV1.firedEmployee(['petar'], [])).to.throw("Invalid input");
            expect(() => company_administrationV1.firedEmployee(['petar', 'ivan'],null)).to.throw("Invalid input");
        });
    });
});
