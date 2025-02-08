document.addEventListener('DOMContentLoaded', function() {
    fetch('http://localhost:8080/api/hello')
        .then(response => response.text())
        .then(data => {
            document.getElementById('greeting').innerText = data;
        })
        .catch(error => {
            console.error('Error fetching data: ', error);
            document.getElementById('greeting').innerText = 'Failed to load message.';
        });
});