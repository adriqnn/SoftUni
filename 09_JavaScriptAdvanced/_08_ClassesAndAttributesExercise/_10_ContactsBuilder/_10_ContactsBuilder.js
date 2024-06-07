class ContactsBuilderV1{
    constructor(firstName, lastName, phone, email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this._online = false;
    }

    get online(){
        return this._online;
    }

    set online(value){
        this._online = value;
        if(this.titleDiv){
            this.titleDiv.className = this._online ? 'title online' : 'title';
        }
    }

    render(id){
        this.article = document.createElement('article');
        this.titleDiv = document.createElement('div');
        this.btnI = document.createElement('button');
        this.infoDiv = document.createElement('div');
        this.phoneSpan = document.createElement('span');
        this.emailSpan = document.createElement('span');

        this.titleDiv.className = this._online ? 'title online' : 'title';
        this.titleDiv.textContent = this.firstName + ' ' + this.lastName;
        this.btnI.innerHTML = '&#8505';

        this.titleDiv.appendChild(this.btnI);
        this.article.appendChild(this.titleDiv);

        this.phoneSpan.innerHTML = '&phone: ' + this.phone;
        this.emailSpan.innerHTML = '&#9993: ' + this.email;
        this.infoDiv.className = 'info';
        this.infoDiv.style.display = 'none';

        this.infoDiv.appendChild(this.phoneSpan);
        this.infoDiv.appendChild(this.emailSpan);
        this.article.appendChild(this.infoDiv);

        document.getElementById(id).appendChild(this.article);

        this.btnI.addEventListener('click', (e) => {
            this.infoDiv.style.display === 'none' ? this.infoDiv.style.display = 'block' : this.infoDiv.style.display = 'none';
        });
    }
}

class ContactsBuilderV2{
    constructor(firstName, lastName, phone, email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this._online = false;
    }

    get online(){
        return this._online;
    }

    set online(v){
        this._online = v;

        if (this.onlineDiv) {
            this.onlineDiv.className = this._online ? 'title online' : 'title';
        }
    }

    eFactory(tag, content = ''){
        const e = document.createElement(tag);
        e.innerHTML = content;

        return e;
    }

    render(id){
        this.templ = this.eFactory('article');
        this.onlineDiv = this.eFactory('div', `${this.firstName} ${this.lastName}`);
        this.infoBtn = this.eFactory('button', '&#8505;');
        this.infoDiv = this.eFactory('div', `<span>&phone; ${this.phone}</span><span>&#9993; ${this.email}</span>`);

        this.onlineDiv.className = this.online ? 'title online' : 'title';
        this.infoDiv.className = 'info';
        this.infoDiv.style.display = 'none';

        this.onlineDiv.appendChild(this.infoBtn);
        this.templ.appendChild(this.onlineDiv);
        this.templ.appendChild(this.infoDiv);

        document.getElementById(id).appendChild(this.templ);

        this.infoBtn.addEventListener('click', () => {
            this.infoDiv.style.display = this.infoDiv.style.display === 'none' ? 'block' : 'none';
        });
    }
}
