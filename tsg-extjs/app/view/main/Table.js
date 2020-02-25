Ext.define('TelosysGen.view.main.Table', {
	extend : 'Ext.grid.Panel',
	xtype : 'tablelist',
	requires : [ 'TelosysGen.store.Table', 'TelosysGen.view.grid.tbar.GridTbar' ],
	minHeight : 200,
	title : 'Tables',
	autoLoad : true,
	store : {
		type : 'table'
	},
	tbar : {
		xtype : 'gridtbar'
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
	}
});
