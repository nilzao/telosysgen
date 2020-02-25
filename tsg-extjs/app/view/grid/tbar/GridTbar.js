Ext.define('TelosysGen.view.grid.tbar.GridTbar', {
	extend : 'Ext.toolbar.Toolbar',
	xtype : 'gridtbar',
	items : [ {
		xtype : 'button',
		text : 'Sync',
		handler : function(thisObj, event) {
			thisObj.findParentByType("grid").getStore().sync();
		}
	} ]
});
