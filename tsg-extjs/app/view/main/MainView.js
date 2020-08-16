/**
 * This class is the main view for the application. It is specified in app.js as
 * the "mainView" property. That setting automatically applies the "viewport"
 * plugin causing this view to become the body element (i.e., the viewport).
 *
 * TODO - Replace this content of this view to suite the needs of your
 * application.
 */
Ext.define('TelosysGen.view.main.MainView', {
    extend: 'Ext.container.Viewport',
    xtype: 'app-main-view',

    requires: ['Ext.data.proxy.Rest',
        'TelosysGen.view.grid.Column', 'TelosysGen.view.grid.Database', 'TelosysGen.view.grid.Fk',
        'TelosysGen.view.grid.FkCol', 'TelosysGen.view.grid.Link', 'TelosysGen.view.grid.LinkJoincolumn',
        'TelosysGen.view.grid.Table'],
    layout: 'border',
    id: 'mainLayout',
    bodyBorder: false,

    defaults: {
        split: true,
        bodyPadding: 10,
        id: 'contentwindow',
        margin: '5 0 0 0'
    },

    items: [{
        title: 'TelosysGen',
        region: 'west',
        id: 'menuwindow',
        floatable: false,
        collapsible: true,
        // collapseMode : 'mini',
        width: 210,
        minWidth: 100,
        maxWidth: 250,

        rootVisible: true,
        columnLines: true,
        rowLines: true,
        xtype: 'treepanel',
        useArrows: true,
        listeners: {
            itemclick: function (thisObj, record, item, index, e, eOpts) {
                // var contentwindow = Ext.getCmp('contentwindow');
                // contentwindow.removeAll(true);
                if (typeof record.getData().xtypeTmp !== 'undefined') {
                    // contentwindow.add({
                    // xtype : record.getData().xtypeTmp
                    // });
                    var mainlayout = Ext.getCmp('mainLayout');
                    mainlayout.remove(Ext.getCmp('contentwindow'));
                    mainlayout.add({
                        xtype: record.getData().xtypeTmp,
                        region: 'center'
                    });
                }
            }
        },
        store: {
            root: {
                expanded: true,
                expandable: false,
                text: 'database',
                xtypeTmp: 'database-grid',
                children: [
                    {
                        expanded: true,
                        expandable: false,
                        text: 'tables',
                        xtypeTmp: 'table-grid',
                        children: [{
                            text: 'columns',
                            xtypeTmp: 'column-grid',
                            leaf: true
                        }, {
                            text: 'fks',
                            expanded: true,
                            xtypeTmp: 'fk-grid',
                            children: [{
                                text: 'fkCols',
                                xtypeTmp: 'fkcol-grid',
                                leaf: true
                            }]
                        }, {
                            text: 'links',
                            xtypeTmp: 'link-grid',
                            expanded: true,
                            children: [{
                                text: 'linkJoinCols',
                                xtypeTmp: 'linkjoincolumn-grid',
                                leaf: true
                            }]
                        }]
                    }]
            }
        },
    }, {
        title: 'Main Content',
        collapsible: false,
        region: 'center',
        items: {
            html: '<h2>Main Page</h2><p>This is where the main content would go</p>'
        }
    }]
});
