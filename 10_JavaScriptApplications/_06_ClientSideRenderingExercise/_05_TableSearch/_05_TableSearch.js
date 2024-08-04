import { html, render } from "../node_modules/lit-html/lit-html.js";

function table_searchV1() {
   const htmlElements = {
      tbody: document.querySelector('tbody'),
      input: document.querySelector('input'),
      btn: document.querySelector('#searchBtn')
   }

   populateTable();
   htmlElements.btn.addEventListener('click', onClick);

   async function populateTable(){
      try{
         const res = await fetch('http://localhost:3030/jsonstore/advanced/table');

         if(!res.ok){
            throw new Error('Error');
         }

         const data = await res.json();

         const row = (e) => html `<tr id="${e._id}">
                                      <td>${e.firstName} ${e.lastName}</td>
                                      <td>${e.email}</td>
                                      <td>${e.course}</td>
                                   </tr>`;

         render(Object.values(data).map(e => row(e)), htmlElements.tbody);
      }catch(err){
         console.log(err.message);
      }
   }

   function onClick(){
      let rows = document.querySelectorAll('tbody tr');

      for(let row of rows){
         row.classList.remove('select');

         if(row.innerHTML.includes(htmlElements.input.value)){
            row.className = 'select';
         }
      }

      htmlElements.input.value = '';
   }
}

table_searchV1();
