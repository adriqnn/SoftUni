import { html } from '../../node_modules/lit-html/lit-html.js';

const NavLink = ({ attributes, text }, click) =>
    click ? html `<a @click=${click} id=${attributes.id} href=${attributes.href}>${text}</a>`
          : html `<a id=${attributes.id} href=${attributes.href}>${text}</a>`;

export { NavLink };
