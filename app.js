const baseEndpoint = 'https://api.github.com';
const usersEndpoint = `${baseEndpoint}/users`;
const $n = document.querySelector('.name'); /* debería ser .name para llamamar a una clase, no es una etiqueta*/
const $b = document.querySelector('.blog');/* debería ser .blog para llamamar a una clase, pues no es un id*/
const $l = document.querySelector('.location'); /*no existe una clase llamada location*/

async function displayUser(username) { /* Falta agregar la palabra reservda async*/
  $n.textContent = 'cargando...';
  const response = await fetch(`${usersEndpoint}/${username}`); /* response no esta siendo llamado en otoro lugar*/
  const data = await response.json()
  console.log(data);
  $n.textContent = '${data.name}';
  $b.textContent = '${data.blog}';
  $l.textContent = '${data.location}';
}

function handleError(err) {
  console.log('OH NO!');
  console.log(err);
  n.textContent = `Algo salió mal: ${err}`
}

displayUser('stolinski').catch(handleError);