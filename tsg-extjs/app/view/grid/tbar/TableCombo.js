Ext.define('TelosysGen.view.grid.tbar.TableCombo', {
	extend : 'Ext.form.field.ComboBox',
	xtype : 'tbar.table.combo',
	fieldLabel : 'Table Filter',
	queryMode : 'remote',
	displayField : 'name',
	valueField : 'id',
	queryParam : 'name',
	store : {
		type : 'table'
	},
	listeners : {
		select : function(combo, record, eOpts) {
			var gridStore = combo.findParentByType("grid").getStore();
			console.log(combo.findParentByType("grid"));
			gridStore.getProxy().setUrl('http://localhost:8080' + gridStore.getProxy().baseUrl + '/search/findByTable_IdTable');
			gridStore.getProxy().setExtraParams({
				tableId : record.getData().id
			});
			gridStore.load();
		},
		beforequery : function(queryPlan, eOpts) {
			if (queryPlan.query == "") {
				queryPlan.combo.getStore().getProxy().setUrl('http://localhost:8080/table');
			} else {
				queryPlan.combo.getStore().getProxy().setUrl('http://localhost:8080/table/search/findByName');
			}
		}
	}
});
