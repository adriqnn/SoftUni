// async function editMoviePage(movie, e){
//     e.preventDefault();
//     displayMovieEdit(movie);
// }
//
// async function editMovie(e){
//     e.preventDefault();
//
//     const formData = new FormData(e.target);
//     const data = Object.fromEntries([...formData.entries()]);
//
//     const movie = {
//         title: data.title,
//         description: data.description,
//         img: data.img
//     }
//
//     await editMovieReq(movie, e);
// }
// async function loadMovie(id){
//     ux.editBtn.addEventListener('click', (e) =>  editMoviePage(movie, e));
//     ux.unlikeBtn.addEventListener('click', (e) =>  unlikeMovie(e, userLiked[0]._id, movie._id));
//
//     if(user?.id === movie._ownerId){
//         ux.deleteBtn.style.display = 'inline';
//         ux.editBtn.style.display = 'inline';
//     }else{
//         ux.deleteBtn.style.display = 'none';
//         ux.editBtn.style.display = 'none';
//     }
//
//     if(user){
//         if(userLiked.length > 0){
//             ux.likeBtn.style.display = 'none';
//             ux.unlikeBtn.style.display = 'inline';
//         }else{
//             ux.likeBtn.style.display = 'inline';
//             ux.unlikeBtn.style.display = 'none';
//         }
//     }else{
//         ux.likeBtn.style.display = 'none';
//         ux.unlikeBtn.style.display = 'none';
//     }
//
//     return divEl;
// }
//
// export { editMoviePage, editMovie, likeMovie, unlikeMovie, deleteMovie, loadMovie, loadAllMovies };
