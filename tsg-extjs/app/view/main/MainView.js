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

	requires : [ 'Ext.data.proxy.Rest', 'TelosysGen.view.main.Database', 'TelosysGen.view.main.Table', 'TelosysGen.view.main.Column', 'TelosysGen.view.main.Fk', 'TelosysGen.view.main.Link' ],
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
		},
		store : {
			storeId : 'proxytreemenu',
			type : 'tree',
			root : {
				text : 'TelosysGen',
				id : 'database',
				expanded : true
			// expanded : false
			},
			proxy : {
				type : 'rest',
				url : TelosysGen.Vars.baseStoreProxyUrl + '/treemenu',
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
