

AUI().use('aui-base','liferay-util-window','aui-io-plugin-deprecated',function(A){
 
   A.one('#<portlet:namespace/>addDepartment').on('click', function(event){
    addDepartment= Liferay.Util.Window.getWindow(
   		
               {
                   dialog: {
                       centered: true,
                       constrain2view: true,
                       modal: true,
                       resizable: true,
                       width: 500,
                       height:500,
                   }
               }).plug(A.Plugin.DialogIframe,
                    {
               	
                    autoLoad: false,
                    iframeCssClass: 'dialog-iframe',                     
                    uri:'<%=adddepURL.toString()%>'
                    }).render();
   				 addDepartment.show();
   				 addDepartment.titleNode.html("Add Department");
                   

    });
  
}); 



Liferay.provide(window, 'refreshPortlet', function() {
        var curPortlet = '#p_p_id<portlet:namespace/>';
        window.location.reload(); 
    },
    ['aui-dialog','aui-dialog-iframe']
);




AUI().use('aui-base','liferay-util-window','aui-io-plugin-deprecated',function(A){
Liferay.provide(window, 'edit', function(e) {
	 var ur='<%=editdURL.toString()%>'+'&<portlet:namespace/>employeeDepartmentId=' + e;
	 	    var editDepartment= Liferay.Util.Window.getWindow(
		                {
		                    dialog: {
		                        centered: true,
		                        constrain2view: true,
		                          modal: true,
		                        resizable: true,
		                        width: 500,
		                        height:500
		                    }
		                }).plug(A.Plugin.DialogIframe,
		                     {
		                     autoLoad: false,
		                     iframeCssClass: 'dialog-iframe',
		                     uri:ur
		                     }).render();
						 	  editDepartment.show();
						 	  editDepartment.titleNode.html("Edit Department");
	});
});



AUI().use('aui-base,aui-io-request',function(A){
A.one('#<portlet:namespace/>saveForm').on('click', function(event) {
    var A = AUI();
    var url = '<%=addDepartmentActionURL.toString()%>';
    A.io.request(
        url,
        {
            method: 'POST',
            form: {id: '<portlet:namespace/>employeeDepartment'},
            on: {
                success: function() {
                  Liferay.Util.getOpener().refreshPortlet();
                	
                } 
            }
        }
    );
});
});