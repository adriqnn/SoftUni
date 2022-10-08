//for each needed resource create requests to the server for information;

import { del, get, post, put } from "./api.js";

//get all memes
export async function getAllMemes(){
    return get('/data/memes?sortBy=_createdOn%20desc');
}
//create a meme
export async function createMeme(meme){
    return post('/data/memes', meme);
}
//get meme
export async function getMemeById(id){
    return get('/data/memes/' + id)
}
//delete meme
export async function deleteMeme(id){
    return del('/data/memes/' + id)
}
//edit meme
export async function updateMeme(id, meme){
    return put('/data/memes/' + id, meme)
}
//get user's memes
export async function getMemesByUser(userId){
    return get(`/data/memes?where=_ownerId%3D%22${userId}%22&sortBy=_createdOn%20desc`)
}
