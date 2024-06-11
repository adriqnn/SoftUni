window.addEventListener("load", gem_collectionV1);

function gem_collectionV1() {
    const input = {
        gemstone: document.getElementById('gem-name'),
        color: document.getElementById('color'),
        carats: document.getElementById('carats'),
        price: document.getElementById('price'),
        type: document.getElementById('type')
    };

    const lists = {
        preview: document.getElementById('preview-list'),
        collection: document.getElementById('collection')
    };

    const submitButton = document.getElementById('add-btn');
    submitButton.addEventListener('click', addToPreview);

    function addToPreview(e){
        e.preventDefault();

        const gemstone = input.gemstone.value;
        const color = input.color.value;
        const carats = input.carats.value;
        const price = input.price.value;
        const type = input.type.value;

        if(gemstone === '' || color === '' || carats === '' || price === '' || type === ''){
            return;
        }

        const li = document.createElement('li');
        li.className = 'gem-info';
        li.innerHTML = `<article>
                        <h4>${gemstone}</h4>
                        <p>Color: ${color}</p>
                        <p>Carats: ${carats}</p>
                        <p>Price: ${price}$</p>
                        <p>Type: ${type}</p>
                    </article>
                    <button class="save-btn">Save to Collection</button>
                    <button class="edit-btn">Edit Information</button>
                    <button class="cancel-btn">Cancel</button>`;

        const saveButton = li.querySelector('.save-btn');
        saveButton.addEventListener('click', save);

        const editButton = li.querySelector('.edit-btn');
        editButton.addEventListener('click', edit);

        const cancelButton = li.querySelector('.cancel-btn');
        cancelButton.addEventListener('click', cancel);


        submitButton.disabled = true;
        lists.preview.appendChild(li);

        input.gemstone.value = '';
        input.color.value = '';
        input.carats.value = '';
        input.price.value = ''; 
        input.type.value = '';

        function save(){
            li.remove();

            const saveLi = document.createElement('li');
            saveLi.innerHTML = `<p class="collection-item">${gemstone} - Color: ${color}/ Carats: ${carats}/ Price: ${price}$/ Type: ${type}</p>`;

            submitButton.disabled = false;
            lists.collection.appendChild(saveLi);
        }

        function edit(){
            input.gemstone.value = gemstone;
            input.color.value = color; 
            input.carats.value = carats;
            input.price.value = price;
            input.type.value = type;

            submitButton.disabled = false;

            li.remove();
        }

        function cancel(){
            lists.preview.innerHTML = '';
            submitButton.disabled = false;
        }
    }
}
