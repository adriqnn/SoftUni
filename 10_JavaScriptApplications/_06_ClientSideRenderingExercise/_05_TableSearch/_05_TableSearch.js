import { html, render } from "../node_modules/lit-html/lit-html.js";

function table_searchV1(){
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

function table_searchV2(){
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

         if(row.innerHTML.toLowerCase().includes(htmlElements.input.value.toLowerCase())){
            row.className = 'select';
         }
      }

      htmlElements.input.value = '';
   }
}

async function table_searchV3(){
   document.querySelector('body').innerHTML = '';

   const thCell = (content) => html `<th>${content}</th>`;
   const tdCell = (content) => html `<td>${content}</td>`;

   const tableHeader = (heads) => html `<thead>
                                           <tr>${heads.map(x => thCell(x))}</tr>
                                        </thead>`;

   const tableBody = (bodyData) => html `<tbody>
                                             ${bodyData.map(x => html `
                                             <tr>
                                                 ${tdCell(`${x.firstName} ${x.lastName}`)} ${tdCell(x.email)} ${tdCell(x.course)}
                                             </tr>`)}
                                         </tbody>`;

   const table = ({ headers, bodyData }) => html `<table class="container">
                                                      ${tableHeader(headers)} ${tableBody(bodyData)}
                                                      <tfoot>
                                                          <tr>
                                                              <td colspan="3">
                                                                  <input type="text" id="searchField"/>
                                                                  <button type="button" id="searchBtn">Search</button>
                                                              </td>
                                                          </tr>
                                                      </tfoot>
                                                 </table>`;

   async function getData (){
      const response = await fetch('http://localhost:3030/jsonstore/advanced/table');
      return response.json();
   }

   const data = await getData();

   const tableData = {
      headers: ['Student name', 'Student email', 'Student course'],
      bodyData: Object.values(data)
   }

   render(table(tableData), document.querySelector('body'));

   document.addEventListener('click', e => {
      if(e.target.tagName === 'BUTTON' && e.target.id === 'searchBtn'){
         const input = document.getElementById('searchField');
         const rows = [...document.getElementsByTagName('tr')].slice(1);

         rows.forEach(x => x.className = '');

         const selectedRows = rows.filter(x => x.textContent.toLocaleLowerCase().includes(input.value.toLocaleLowerCase()));
         selectedRows.forEach(x => x.className = 'select');

         input.value = '';
      }
   });
}

async function table_searchV4(){
   function search(){
      let tableRows = document.querySelector('.container tbody').children;
      let input = document.querySelector('#searchField');

      let searchTerm = input.value;
      input.value = '';

      for(const row of tableRows){
         row.classList.remove('select');

         if(row.textContent.toLowerCase().includes(searchTerm.toLowerCase())){
            row.classList.add('select');
         }
      }
   }

   let url = 'http://localhost:3030/jsonstore/advanced/table';

   function getAllStudents(){
      return fetch(url).then(res => res.json());
   }

   const studentsTemplate = (studentsData) => html `${studentsData.map(s => html `<tr>
                                                                                      <td>${s.firstName} ${s.lastName}</td>
                                                                                      <td>${s.email}</td>
                                                                                      <td>${s.course}</td>
                                                                                   </tr>`)}`;

   let tableBody = document.querySelector('.container tbody');
   let studentData = await getAllStudents();
   let template = studentsTemplate(Object.values(studentData));

   render(template, tableBody);

   let searchButton = document.querySelector('#searchBtn');
   searchButton.addEventListener('click', search);
}
