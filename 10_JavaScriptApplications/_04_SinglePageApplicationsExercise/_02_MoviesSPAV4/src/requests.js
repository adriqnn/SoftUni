
// async function loadMovieReq(id){
//     const res = await fetch(`http://localhost:3030/data/movies/${id}`);
//     const data = await res.json();
//
//     return data;
// }
//
// async function editMovieReq(movie, e){
//     const url = `http://localhost:3030/data/movies`;
//     const userDetails = getUserDetails();
//     const id = e.target.id;
//
//     try {
//         if(hasEmptyStrings(movie)){
//             throw new Error('All fields required!');
//         }
//
//         const res = await fetch(`${url}/${id}`, {
//             method: 'put',
//             headers: {'Content-Type': 'application/json', 'X-Authorization': userDetails.token},
//             body: JSON.stringify(movie)
//         });
//
//         if(!res.ok){
//             const error = await res.json();
//             throw new Error(error.message);
//         }
//
//         e.target.reset();
//         await displayPage('home');
//     }catch(err) {
//         alert(err.message);
//     }
// }
