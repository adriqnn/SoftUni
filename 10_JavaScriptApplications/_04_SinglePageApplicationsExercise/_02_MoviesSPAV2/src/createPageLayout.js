import { navBar } from '../components/navBar.js'
import { footer } from '../components/footer.js'

function applyPageLayout(parent, pageLayout){
    parent.innerHTML = '';
    parent.appendChild(pageLayout);

    return parent;
}

function createPageLayout(data){
    const wrapper = document.createDocumentFragment();
    wrapper.appendChild(navBar());

    if(data){
        wrapper.appendChild(data);
    }

    wrapper.appendChild(footer);

    return wrapper;
}

export { createPageLayout, applyPageLayout };
