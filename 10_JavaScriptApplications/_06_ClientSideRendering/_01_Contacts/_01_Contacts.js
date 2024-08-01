import { contacts } from "./resources/contacts.js";

function contactsV1(){
    const list = contacts;
    const html = {
        contactsDiv: document.getElementById('contacts')
    }

    list.forEach(e => {
        const el = document.createElement('div');

        el.id = e.id;
        el.className = 'contact card';

        el.innerHTML = `<div>
                            <i class="far fa-user-circle gravatar"></i>
                        </div>
                        <div class="info">
                            <h2>Name: ${e.name}</h2>
                            <button class="detailsBtn">Details</button>
                            <div class="details" id="1">
                                <p>Phone number: ${e.phoneNumber}</p>
                                <p>Email: ${e.email}</p>
                            </div>
                        </div>`;

        el.querySelector('button.detailsBtn').addEventListener('click', showDetails);

        function showDetails(){
            const display = el.querySelector('div.details');

            if(display.style.display === 'block'){
                display.style.display = 'none';
            }else{
                display.style.display = 'block';
            }
        }

        html.contactsDiv.appendChild(el);
    });
}

contactsV1();