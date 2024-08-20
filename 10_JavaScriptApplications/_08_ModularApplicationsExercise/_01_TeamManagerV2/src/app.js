import { render } from '../../node_modules/lit-html/lit-html.js';
import page from '../../node_modules/page/page.mjs';

import { HomeView } from '../views/home.js';
import { RegisterView } from '../views/register.js';
import { LoginView } from '../views/login.js';
import { MyTeamsView } from '../views/my.js';
import { CreateView } from '../views/create.js';
import { EditView } from '../views/edit.js';
import { DetailsView } from '../views/details.js';
import { BrowseView } from '../views/browse.js';

import { PageLayout } from '../Components/page.js';
import { contextAPI } from './context.js';
import { isUserLogged } from './helper.js';

const renderView = (view) => render(PageLayout(view), document.getElementById('content'));

page('/', () => renderView(HomeView()));
page('/register', () => renderView(RegisterView()));
page('/login', () => renderView(LoginView()));
page('/myTeams', contextAPI.storeMyTeams, (context) => renderView(MyTeamsView(context)));
page('/create', () => renderView(CreateView()));
page('/edit/:id', contextAPI.storeSingleTeam, (context) => renderView(EditView(context)));
page('/details/:id', contextAPI.storeDetails, (context) => renderView(DetailsView(context)));
page('/browse', contextAPI.storeAllTeamsInfo, (context) => renderView(BrowseView(isUserLogged(), context.teams)));

page();
