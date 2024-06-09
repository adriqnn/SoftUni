import { expect } from "chai";
import { company_administrationV1 } from "./_03_CompanyAdministration.js";

// company_administration_testV1
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

// for judge company_administration_testV1
// describe('Company Administration', () => {
//     describe('hiringEmployee', () => {
//         it('happy path', () => {
//             expect(companyAdministration.hiringEmployee('A', 'Programmer', 3)).to.equal('A was successfully hired for the position Programmer.');
//             expect(companyAdministration.hiringEmployee('A', 'Programmer', 4)).to.equal('A was successfully hired for the position Programmer.');
//             expect(companyAdministration.hiringEmployee('A', 'Programmer', 2)).to.equal('A is not approved for this position.');
//         });
//
//         it('expect error', () => {
//             expect(() => companyAdministration.hiringEmployee('A', 'A', 1)).to.throw('We are not looking for workers for this position.');
//         });
//     });
//
//     describe('calculateSalary', () => {
//         it('happy path', () => {
//             expect(companyAdministration.calculateSalary(1)).to.equal(15);
//             expect(companyAdministration.calculateSalary(160)).to.equal(2400);
//             expect(companyAdministration.calculateSalary(161)).to.equal(3415);
//         });
//
//         it('expect error', () => {
//             expect(() => companyAdministration.calculateSalary('1')).to.throw("Invalid hours");
//             expect(() => companyAdministration.calculateSalary(-1)).to.throw("Invalid hours");
//             expect(() => companyAdministration.calculateSalary([])).to.throw("Invalid hours");
//             expect(() => companyAdministration.calculateSalary(null)).to.throw("Invalid hours");
//             expect(() => companyAdministration.calculateSalary(undefined)).to.throw("Invalid hours");
//         });
//     });
//
//     describe('firedEmployee', () => {
//         it('happy path', () => {
//             expect(companyAdministration.firedEmployee(["petar", "ivan"], 0)).to.equal("ivan");
//             expect(companyAdministration.firedEmployee(["petar", "ivan", "petkan"], 0)).to.equal("ivan, petkan");
//         });
//
//         it('expect error', () => {
//             expect(() => companyAdministration.firedEmployee('1', '1')).to.throw("Invalid input");
//             expect(() => companyAdministration.firedEmployee(1, '1')).to.throw("Invalid input");
//             expect(() => companyAdministration.firedEmployee('1', 1)).to.throw("Invalid input");
//             expect(() => companyAdministration.firedEmployee(['petar', 'ivan'],-1)).to.throw("Invalid input");
//             expect(() => companyAdministration.firedEmployee(['petar', 'ivan'],30)).to.throw("Invalid input");
//             expect(() => companyAdministration.firedEmployee({}, {})).to.throw("Invalid input");
//             expect(() => companyAdministration.firedEmployee({}, 1)).to.throw("Invalid input");
//             expect(() => companyAdministration.firedEmployee(1, {})).to.throw("Invalid input");
//             expect(() => companyAdministration.firedEmployee([], 1)).to.throw("Invalid input");
//             expect(() => companyAdministration.firedEmployee(['petar', 'ivan'],null)).to.throw("Invalid input");
//             expect(() => companyAdministration.firedEmployee(1, 1)).to.throw("Invalid input");
//             expect(() => companyAdministration.firedEmployee([], '1')).to.throw("Invalid input");
//             expect(() => companyAdministration.firedEmployee([], -1)).to.throw("Invalid input");
//             expect(() => companyAdministration.firedEmployee(['petar'], 1)).to.throw("Invalid input");
//             expect(() => companyAdministration.firedEmployee(['petar'], [])).to.throw("Invalid input");
//             expect(() => companyAdministration.firedEmployee(['petar', 'ivan'],null)).to.throw("Invalid input");
//         });
//     });
// });