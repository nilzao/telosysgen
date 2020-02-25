/**
 * This class is the main view for the application. It is specified in app.js as
 * the "mainView" property. That setting automatically applies the "viewport"
 * plugin causing this view to become the body element (i.e., the viewport).
 * 
 * TODO - Replace this content of this view to suite the needs of your
 * application.
 */
Ext.define('TelosysGen.view.main.MainView', {
	extend : 'Ext.container.Viewport',
	xtype : 'app-main-view',

	requires : [ 'TelosysGen.view.main.Database', 'TelosysGen.view.main.Table', 'TelosysGen.view.main.Column', 'TelosysGen.view.main.Fk', 'TelosysGen.view.main.Link' ],
	layout : 'border',

	bodyBorder : false,

	defaults : {
		split : true,
		bodyPadding : 10
	},

	items : [ {
		title : 'TelosysGen',
		region : 'west',
		floatable : false,
		collapsible : true,
		// collapseMode : 'mini',
		margin : '5 0 0 0',
		width : 200,
		minWidth : 100,
		maxWidth : 250,

		rootVisible : true,
		xtype : 'treepanel',
		listeners : {
			itemclick : function(thisObj, record, item, index, e, eOpts) {
				var contentwindow = Ext.getCmp('contentwindow');
				contentwindow.removeAll(true);
				if (typeof record.getData().xtypeTmp !== 'undefined') {
					contentwindow.add({
						xtype : record.getData().xtypeTmp
					});
				}
			}
		// , beforeitemmousedown : function(thisObj, record, item, index, e, eOpts)
		// {
		// var currentTreeType = record.getData().currentTreeType;
		// if (typeof currentTreeType !== 'undefined') {
		// var proxy = Ext.getStore('proxytreemenu').getProxy();
		// proxy.setUrl(proxy.baseUrl);
		// // var id = record.getData().itemId;
		// var id = 1;
		// proxy.getReader().setRootProperty('_embedded.table')
		// proxy.setUrl(proxy.baseUrl + currentTreeType + "/" + id + "/tableList");
		// }
		// }
		},
		store : {
			storeId : 'proxytreemenu',
			type : 'tree',
			// listeners : {
			// load : function(thisObj, records, successful, operation, node, eOpts) {
			// if (records != null) {
			// for (i = 0; i < records.length; i++) {
			// records[i].setId(records[i].getData().id +
			// records[i].getData().currentTreeType);
			// }
			// }
			// }
			// },
			root : {
				text : 'TelosysGen',
				id : 'database',
				expanded : true
			// expanded : false
			},
			proxy : {
				type : 'rest',
				url : 'http://localhost:8080/treemenu',
				// url : 'http://localhost:8888/go.json',
				// baseUrl : 'http://localhost:8080/',
				// appendId : false,
				// idParam: 'idView',
				reader : {
					type : 'json',
					rootProperty : 'treemenu'
				}
			}
		},
	}, {
		title : 'Main Content',
		id : 'contentwindow',
		collapsible : false,
		region : 'center',
		margin : '5 0 0 0',
		items : {
			html : '<h2>Main Page</h2><p>This is where the main content would go</p>'
		}
	} ]
});
