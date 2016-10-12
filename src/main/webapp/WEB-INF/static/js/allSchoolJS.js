$(function() {
	$.notify(
	        {
	          icon: 'glyphicon glyphicon-refresh',
	          message: "Loading....."
	        },{
	          type: 'info',
	          delay: 4000,
	          template: '<div data-notify="container" class="col-xs-5 col-sm-3 col-xl-2 alert alert-{0}" role="alert">' +
	                    '<button type="button" aria-hidden="true" class="close" data-notify="dismiss">×</button>' +
	                    '<span data-notify="icon"></span> ' +
	                    '<span data-notify="title">{1}</span> ' +
	                    '<span data-notify="message">{2}</span>' +
	                    '<div class="progress" data-notify="progressbar">' +
	                      '<div class="progress-bar progress-bar-{0}" role="progressbar" aria-valuenow="0" aria-valuemin="0" aria-valuemax="100" style="width: 0%;"></div>' +
	                    '</div>' +
	                    '<a href="{3}" target="{4}" data-notify="url"></a>' +
	                  '</div>' 
	      });


	var query = new Object();
	$.ajax({
      type: "POST",
      url: "searchSchools",
      data: JSON.stringify(query),
      contentType :   'application/json',
      dataType: "json",
         success: function(result){
	    	var table=$('#schoolTable').DataTable();
	    	table.clear().draw();
	    	table.rows.add(result).draw();
	    	$.notify(
	        {
	          icon: 'glyphicon glyphicon-ok-circle',
	          message: "Load success!"
	        },{
	          type: 'success',
	          delay: 2000,
	          template: '<div data-notify="container" class="col-xs-5 col-sm-3 col-xl-2 alert alert-{0}" role="alert">' +
	                    '<button type="button" aria-hidden="true" class="close" data-notify="dismiss">×</button>' +
	                    '<span data-notify="icon"></span> ' +
	                    '<span data-notify="title">{1}</span> ' +
	                    '<span data-notify="message">{2}</span>' +
	                    '<div class="progress" data-notify="progressbar">' +
	                      '<div class="progress-bar progress-bar-{0}" role="progressbar" aria-valuenow="0" aria-valuemin="0" aria-valuemax="100" style="width: 0%;"></div>' +
	                    '</div>' +
	                    '<a href="{3}" target="{4}" data-notify="url"></a>' +
	                  '</div>' 
	      });
         }
    });
// costom column sort function for datatable
jQuery.extend( jQuery.fn.dataTableExt.oSort, {
    "non-empty-string-asc": function (str1, str2) {
        if(str1 == "" || str1 == null)
            return 1;
        if(str2 == "" || str2 == null)
            return -1;
        return ((str1 < str2) ? -1 : ((str1 > str2) ? 1 : 0));
    },
 
    "non-empty-string-desc": function (str1, str2) {
        if(str1 == "" || str1 == null)
            return 1;
        if(str2 == "" || str2 == null)
            return -1;
        return ((str1 < str2) ? 1 : ((str1 > str2) ? -1 : 0));
    }
} );
jQuery.extend( jQuery.fn.dataTableExt.oSort, {
    "non-empty-number-asc": function (num1, num2) {
    if(num1 == null)
        return 1;
    if(num2 == null)
        return -1;
    return ((num1 < num2) ? -1 : ((num1 > num2) ? 1 : 0));
	},
    "non-empty-number-desc": function (num1, num2) {
    if(num1 == null)
        return 1;
    if(num2 == null)
        return -1;
    return ((num1 < num2) ? 1 : ((num1 > num2) ? -1 : 0));
	}
} );


$('#schoolTable').DataTable({
	"scrollX" : true,
	"columns" : [ {
		"data" : "schoolName",
		"render" : function(data, type, row, meta){
				return '<a href="/CollegeSearch/school/searchSchoolByName/'+data+' "target="_blank">'+data+'</a>';
		}
	}, {
		"data" : "rankOverall",
		"render" : function(data, type, row, meta){
			if(data<=0){
				return null;
			}else{
				return data;
			}
		}
	}, {
		"data" : "totalCost",		
		"render" : function(data, type, row, meta){
			if(data <= 0){
				return null;
			}else{
				return data;
			}
		}
	}, {
		"data" : "averageGpa",
		"render" : function(data, type, row, meta){
			if(data <= 0){
				return null;
			}else{
				return data;
			}
		}
	}, {
		"data" : "sat125and75",
		"render" : function(data, type, row, meta){
			if(data == '-- / --' || data == '0 / 0'){
				return null;
			}else{
				return data;
			}
		}
	}, {
		"data" : "toeflMinAndAvg",
		"render" : function(data, type, row, meta){
			if(data == '-- / --' || data == '0 / 0' || data == '0 / --' || data == 'UNKNOWN'){
				return null;
			}else{
				return data;
			}
		}
	}, {
		"data" : "applicationDeadline"
	}, {
		"data" : "state"
	}, {
		"data" : "acceptRate"
	}, {
		"data" : "type"
	}, {
		"data" : "setting"
	}, {
		"data" : "category"
	}, {
		"data" : "size",
		"render" : function(data, type, row, meta){
			if(data <= 0 || data == null){
				return null;
			}else{
				return data;
			}
		}
	}, ],
	"language" : {
		"emptyTable" : "Please Search By The Option Above"
	},
    "columnDefs": [
    	{type: 'non-empty-number', targets: 1},
    	{type: 'non-empty-number', targets: 2},
    	{type: 'non-empty-number', targets: 3},
    	{type: 'non-empty-string', targets: 4},
    	{type: 'non-empty-string', targets: 5},
    	{type: 'non-empty-string', targets: 6},
    	{type: 'non-empty-number', targets: 8},
      	{type: 'non-empty-string', targets: 9}, 
       	{type: 'non-empty-string', targets: 10} 
    ]

});


});
