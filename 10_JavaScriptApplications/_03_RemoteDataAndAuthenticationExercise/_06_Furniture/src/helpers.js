const access = {
    guest: document.getElementById('guest'),
    user: document.getElementById('user'),
}

async function createUserDetails(event, type){
    const formData = new FormData(event.target);
    const email = formData.get('email');
    const password = formData.get('password');

    try{
        if(type === 'register'){
            const rePass = formData.get('rePass');

            if(email === '' || password === ''){
                throw new Error('All field must be filled!');
            }else if(password !== rePass){
                throw new Error("Passwords don't match!");
            }
        }

        const response = await fetch(`http://localhost:3030/users/${type}`, {
            method: 'post',
            headers: { 'Content-Type':'application/json' },
            body: JSON.stringify({ email, password })
        });

        if(!response.ok){
            const error = await response.json();
            throw new Error(error.message);
        }

        const data = await response.json();

        const userData = {
            email: data.email,
            id: data._id,
            token: data.accessToken
        };

        sessionStorage.setItem('userData', JSON.stringify(userData));
        window.location = './index.html';
    }catch(error){
        alert(error.message);
    }
}

function userDetailsCheck(){
    const userData = JSON.parse(sessionStorage.getItem('userData'));

    if(userData !== null){
        access.user.style.display = 'inline';
        if(access.guest){
            access.guest.style.display = 'none';
        }
    }else{
        if(access.user){
            access.user.style.display = 'none'
        }
        access.guest.style.display = 'inline';
    }
}

function getUserDetails(){
    return JSON.parse(sessionStorage.getItem('userData'));
}

function clearFields(arr){
    arr.forEach(x => x.value = '');
}

export { createUserDetails, userDetailsCheck, getUserDetails, clearFields };
