const { chromium } = require('playwright-chromium');
const { expect } = require('chai');

let browser, page; // Declare reusable variables

describe('E2E testing', function () {
    this.timeout(6000);

    before(async () => { browser = await chromium.launch({headless: false, slowMo: 500}); });
    after(async () => { await browser.close(); });
    beforeEach(async () => { page = await browser.newPage(); });
    afterEach(async () => { await page.close(); });

    it('Load messages.', async () => {
        await page.goto('http://localhost:63343/.../_01_Messenger');

        const response = await Promise.all([
            page.click('text=Refresh'),
            page.waitForRequest('**/jsonstore/messenger')
        ]);

        const content = await page.$eval('textarea[id="messages"]', (m) => m.value);

        expect(content).to.contains(`Ivan: Hello, are you there?`);
        expect(content).to.contains(`Garry: Yep, whats up :?`);
        expect(content).to.contains(`Ivan: How are you? Long time no see? :)`);
        expect(content).to.contains(`George: Hello, guys! :))`);
        expect(content).to.contains(`Ivan: Hello, George nice to see you! :)))`);
    });

    it('Send message.', async () => {
        await page.goto('http://localhost:63343/.../_01_Messenger');
        await page.fill('#author', 'User');
        await page.fill('#content', 'message');
        await page.click('text=Send');
        await page.click('text=Refresh');

        const content = await page.$eval('textarea[id="messages"]', (m) => m.value);

        expect(content).to.contains('User: message');
    });
});
