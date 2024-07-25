import { get, post, del } from "./api.js";
import { getUserDetails } from "./generalUtil.js";

async function onLikeMovie(ctx, movieId){
    const userDetails = getUserDetails();
    const like = { movieId, ownerID: userDetails.id };

    await post('/data/likes', like);
    ctx.goTo('movieDetailsPage', movieId);
}

async function onUnlikeMovie(ctx, data){
    await del(`/data/likes/${data.likeId}`);
    ctx.goTo('movieDetailsPage', data.movieId);
}

async function onDeleteMovie(ctx, movieId){
    await del(`/data/movies/${movieId}`);
    ctx.goTo('homePage');
}

async function movieLikes(movieId){
    return await get(`/data/likes?where=movieId%3D%22${movieId}%22&distinct=_ownerId&count`);
}

async function userLiked(userId, movieId){
    return await get(`/data/likes?where=movieId%3D%22${movieId}%22%20and%20_ownerId%3D%22${userId}%22`);
}

export { onLikeMovie, onUnlikeMovie, onDeleteMovie, movieLikes, userLiked };
