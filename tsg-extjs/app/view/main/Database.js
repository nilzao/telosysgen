Ext.define('TelosysGen.view.main.Database', {
	extend : 'Ext.grid.Panel',
	xtype : 'databaselist',
	requires : [ 'TelosysGen.store.Database' ],

	title : 'Databases',
	autoLoad : true,
	store : {
		type : 'database'
	},
	columns : [ {
		text : 'Id',
		dataIndex : 'id'
	}, {
		text : 'Name',
		dataIndex : 'name'
	} ]
});
