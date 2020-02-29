Ext.define('TelosysGen.view.main.Table', {
	extend : 'Ext.grid.Panel',
	xtype : 'tablelist',
	requires : [ 'TelosysGen.store.Table', 'TelosysGen.view.grid.tbar.GridTbar' ],
	minHeight : 400,
	title : 'Tables',
	autoLoad : true,
	store : {
		type : 'table'
	},
	tbar : {
		items : [ {
			xtype : 'gridtbar'
		}, {
			itemId : 'tableNameSearchField',
			xtype : 'textfield',
			emptyText : 'table name%'
		}, {
			xtype : 'button',
			text : 'Filter',
			handler : function(thisObj, eOpts) {
				var toolbar = thisObj.findParentByType('toolbar')
				var tableNameSearchField = toolbar.getComponent('tableNameSearchField').getValue();
				var gridStore = thisObj.findParentByType("grid").getStore();
				gridStore.getProxy().setUrl(TelosysGen.Vars.baseStoreProxyUrl + '/table/search/findByName');
				gridStore.getProxy().setExtraParams({
					name : tableNameSearchField
				});
				gridStore.reload();
			}
		} ]
	},
	columns : [ {
		text : 'Id',
		dataIndex : 'id'
	}, {
		text : 'Name',
		dataIndex : 'name',
		editor : 'textfield'
	}, {
		text : 'Java Bean',
		dataIndex : 'javaBean',
		editor : 'textfield'
	}, {
		text : 'Schema',
		dataIndex : 'schema',
		editor : 'textfield'
	}, {
		text : 'Catalog',
		dataIndex : 'catalog',
		editor : 'textfield'
	}, {
		text : 'Database Comment',
		dataIndex : 'databaseComment',
		flex : 1,
		editor : 'textfield'
	}, {
		text : 'Database Type',
		dataIndex : 'databaseType',
		editor : 'textfield'
	} ],
	plugins : {
		ptype : 'rowediting',
		clicksToEdit : 2
	},
	bbar : {
		xtype : 'pagingtoolbar',
		displayInfo : true
	}
});
