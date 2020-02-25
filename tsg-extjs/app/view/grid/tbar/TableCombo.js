Ext.define('TelosysGen.view.grid.tbar.TableCombo', {
	extend : 'Ext.form.field.ComboBox',
	xtype : 'tbar.table.combo',
	fieldLabel : 'Table Filter',
	queryMode : 'remote',
	displayField : 'name',
	valueField : 'id',
	store : {
		type : 'table'
	},
	listeners : {
		change : function(thisObj, newValue, oldValue, eOpts) {
			var gridStore = thisObj.findParentByType("grid").getStore();
			gridStore.getProxy().setUrl('http://localhost:8080/column/search/findByTable_IdTable');
			gridStore.getProxy().setExtraParams({
				tableId : newValue
			});
			gridStore.load();
		}
	}
});
