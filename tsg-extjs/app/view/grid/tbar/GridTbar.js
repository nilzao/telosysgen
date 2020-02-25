Ext.define('TelosysGen.view.grid.tbar.GridTbar', {
	extend : 'Ext.toolbar.Toolbar',
	xtype : 'gridtbar',
	setGridStoreEvents : function() {
		this.getGridStore().on({
			load : function(thisObj, records, successful, operation, eOpts) {
				this.getComponent('currentPageLabel').setText(thisObj.currentPage);
			},
			scope : this
		});
	},
	getGridStore : function() {
		return this.findParentByType("grid").getStore();
	},
	nextPage : function() {
		this.getGridStore().nextPage();
	},
	previousPage : function() {
		this.getGridStore().previousPage();
	},
	items : [ {
		xtype : 'button',
		text : 'Sync',
		handler : function(thisObj, event) {
			thisObj.findParentByType("grid").getStore().sync();
		}
	}, {
		xtype : 'tbspacer'
	}, {
		xtype : 'button',
		text : 'Prev',
		handler : function(thisObj, event) {
			thisObj.findParentByType("gridtbar").previousPage();
		}
	}, {
		xtype : 'label',
		text : 'Page:'
	}, {
		itemId : 'currentPageLabel',
		xtype : 'label',
		text : '0'
	}, {
		xtype : 'tbspacer'
	}, {
		xtype : 'button',
		text : 'Next',
		handler : function(thisObj, event) {
			thisObj.findParentByType("gridtbar").nextPage();
		}
	} ],
	listeners : {
		beforerender : function(thisObj, eOpts) {
			thisObj.setGridStoreEvents();
		}
	}
});
