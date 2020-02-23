Ext.define('TelosysGen.view.main.Fk', {
	extend : 'Ext.grid.Panel',
	xtype : 'fklist',
	requires : [ 'TelosysGen.store.Fk' ],

	title : 'Fks',
	autoLoad : true,
	store : {
		type : 'fk'
	},
	columns : [ {
		text : 'Id',
		dataIndex : 'id'
	}, {
		text : 'Name',
		dataIndex : 'name'
	} ]
});
