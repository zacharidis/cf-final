 new Chart(document.getElementById("myChart"), {
    type: 'doughnut',
    data: {
        labels:['Java','SQL','Python','Spring'],
        datasets: [{
            label: 'my first data',
            backgroundColor :["#3e95cd","#8e5ea2","#3cba9f",'#fffffff'],
            borderColor:'rgb(255,99,132)',
            data:[25,25,25,25]

        }]

    }, options :{}

});