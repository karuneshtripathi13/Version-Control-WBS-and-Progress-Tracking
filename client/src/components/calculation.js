import $ from 'jquery'; 
// bar graph
var participant = [];
var maxPoints = 100;
var barWidth = 75;

//window.onload = function() { document.getElementsByTagName('input')[0].value = maxPoints; }; function setMaxPoints() { maxPoints = document.getElementsByTagName('input')[0].value; }        
// function addTask(){
//     document.getElementById('task').value=name;
//     gatherData();
// }

export function gatherData()
    {   
        var password = 0000;
        var pass=window.prompt('Please enter the admin password');
        pass = pass.replace(/\s+/g, '');
        if(pass==password){

            //var name=document.getElementById('task').value;
            var name=window.prompt('Please enter the name of the Task(only Alphabets):');
            name = name.replace(/\s+/g, '');
            if ((/[^A-Z\s\-\']/gi.test(name)) || (name == '') || (name == 'undefined'))
            {
                alert ('You must enter a valid Task name! ');
                return;
            }
            //var points=document.getElementById('points').value;
             var points = window.prompt('Please enter the percentage of task completed(only number):');
            points = parseInt(points, 10);
            if ((/[^0-9\s\-\']/gi.test(points)) || (points == ''))
            {
                alert ('You must enter a valid number! ');
                return;
            }
        
            participant.push({name: name, points: points});
        
            createChart();
        }
        else{
            alert('Only admin can Edit this field.');
        }
        
    };
export function createChart ()
    {
        var i = 0;
        var len = participant.length;
        var bar = null;
        var sum=0;
        var progress1=0;
        var container = document.getElementById('chart');
        container.innerHTML='';

        while (i < len)
        {

            bar = document.createElement('div');
            bar.style.width = barWidth + 'px';
            bar.style.backgroundColor = getRandomColor();
            bar.style.float = 'left';
            bar.style.marginRight = '10px';

            bar.style.height = ((participant[i].points / maxPoints) * 200) + 'px';
            bar.style.marginTop = 200 - parseInt(bar.style.height) + 'px';
            var percent = participant[i].points + '%';    
            bar.innerHTML = ['<p style="margin-top: ' + (parseInt(bar.style.height) - 17) + 'px">', Math.round(percent), '<br />', participant[i].name, '</p>'].join('');

            container.appendChild(bar);
            sum=sum+participant[i].points;
            progress1=Math.round(sum/participant.length);
            i = i + 1;
            
        }
        console.log(progress1);
        progressBar(progress1,100);
        return progress1;
    };

export function getRandomColor () {
    return ['rgb(', Math.floor(Math.random() * 255), ', ', Math.floor(Math.random() * 255), ', ', Math.floor(Math.random() * 255), ')'].join('');
 };
         


//circle
export function progressBar(progressVal,totalPercentageVal = 100) {
    var el = Math.round(progressVal) + '%';
    document.getElementById("ho").innerHTML =el;
    var strokeVal = (4.64 * 100) /  totalPercentageVal;
	var x = document.querySelector('.progress-circle-prog');
    x.style.strokeDasharray = progressVal * (strokeVal) + ' 999';
	//var el = document.getElementsByClassName('progress-text');
    //el.innerHTML=createChart();
     //var el = document.querySelector('.progress-text'); 
	var from = $('.progress-text').data('progress');
	$('.progress-text').data('progress', progressVal);
	var start = new Date().getTime();
  
	setTimeout(function() {
	    var now = (new Date().getTime()) - start;
	    var progress = now / 700;
	    //el.innerHTML = progressVal / totalPercentageVal * 100 + '%';
        //el.innerHTML=progress1;
        //$('.progress-text').empty().append(progressVal / totalPercentageVal * 100 + '%');
	    //$('.progress-text').html('Hello World');
        if (progress < 1) setTimeout(arguments.callee, 10);
	}, 10);

}

//progressBar(10,200);