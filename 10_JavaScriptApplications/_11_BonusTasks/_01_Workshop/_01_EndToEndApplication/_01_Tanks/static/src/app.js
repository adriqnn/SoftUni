import page from './lib/page.mjs';

import { homeView } from './views/home.js';
import { loginView } from './views/login.js';
import { regsiterView } from './views/register.js';
import { catalogView } from './views/catalog.js';
import { createView } from './views/create.js';
import { detailsView } from './views/details.js';
import { closeGame } from './engine/game.js';
import { canvasView } from './views/canvas.js';

import { addLogout } from './middlewares/logout.js';
import { addRender } from './middlewares/render.js';
import { addSession } from './middlewares/session.js';

const main = document.getElementById('main');

page(addSession());
page(addLogout());
page(addRender(main));

page('/index.html', '/');
page('/', homeView);
page('/login', loginView);
page('/register', regsiterView);
page('/games', catalogView);
page('/games/:id', detailsView);
page('/play/:id', canvasView);
page.exit('/play/:id', (ctx, next) => {
    closeGame();
    next();
});
page('/create', createView);

page.start();
