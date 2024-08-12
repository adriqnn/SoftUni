import { html } from '../../node_modules/lit-html/lit-html.js';

import { Header } from './Header.js';

const PageLayout = (...children) => html `${Header()}
                                          ${children}`;

export { PageLayout };
