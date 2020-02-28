Ext.define('TelosysGen.view.grid.tbar.GridTbar', {
	extend : 'Ext.toolbar.Toolbar',
	requires : [ 'Ext.form.Label' ],
	xtype : 'gridtbar',
	items : [ {
		xtype : 'button',
		text : 'Sync',
		handler : function(thisObj, event) {
			thisObj.findParentByType("grid").getStore().sync();
		}
	} ]
});
