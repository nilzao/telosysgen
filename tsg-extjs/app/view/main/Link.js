Ext.define('TelosysGen.view.main.Link', {
	extend : 'Ext.grid.Panel',
	xtype : 'linklist',
	requires : [ 'TelosysGen.store.Link' ],

	title : 'Links',
	autoLoad : true,
	store : {
		type : 'link'
	},
	columns : [ {
		text : 'Id',
		dataIndex : 'id'
	}, {
		text : 'Name',
		dataIndex : 'name'
	} ]
});
