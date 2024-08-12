import page from '../../node_modules/page/page.mjs';
import { render } from '../../node_modules/lit-html/lit-html.js';

import { Dashboard } from '../Views/Dashboard.js';
import { Login } from '../Views/Login.js';
import { Register } from '../Views/Register.js';
import { Catalog } from '../Views/Catalog.js';
import { Create } from '../Views/Create.js';
import { Edit } from '../Views/Edit.js';
import { Details } from '../Views/Details.js';

import { context } from './context.js';
import { PageLayout } from '../components/page.js';

const renderView = (view) => render(PageLayout(view), document.querySelector('body'));

page.redirect('/', '/dashboard');
page('/dashboard', context.storeAllFurniture, (context) => renderView(Dashboard(context.allFurniture)));
page('/catalog', () => renderView(Catalog()));
page('/create', () => renderView(Create()));
page('/details/:id', context.storeFurnitureItem, (context) => renderView(Details(context.currentItem)));
page('/edit/:id', context.storeFurnitureItem, (context) => renderView(Edit(context.currentItem)));
page('/Edit', () => renderView(Edit()));
page('/Login', () => renderView(Login()));
page('/my-furniture', context.storeMyFurniture, (context) => renderView(Dashboard(context.myFurniture)));
page('/register', () => renderView(Register()));

page.start();
