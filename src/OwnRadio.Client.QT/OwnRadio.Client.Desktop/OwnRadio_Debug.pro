# ----------------------------------------------------
# This file is generated by the Qt Visual Studio Add-in.
# ------------------------------------------------------

TEMPLATE = app
TARGET = OwnRadio
DESTDIR = ../Win32/Debug
QT += core multimedia sql network widgets gui
CONFIG += debug
DEFINES += QT_DLL QT_MULTIMEDIA_LIB QT_NETWORK_LIB QT_SQL_LIB QT_WIDGETS_LIB
INCLUDEPATH += ./GeneratedFiles \
    . \
    ./GeneratedFiles/Debug
DEPENDPATH += .
MOC_DIR += ./GeneratedFiles/debug
OBJECTS_DIR += debug
UI_DIR += ./GeneratedFiles
RCC_DIR += ./GeneratedFiles
include(OwnRadio.pri)
win32:RC_FILE = OwnRadio.rc
