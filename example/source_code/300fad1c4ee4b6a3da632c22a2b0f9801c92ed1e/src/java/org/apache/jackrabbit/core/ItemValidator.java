org apach jackrabbit core
org apach jackrabbit core nodetyp effect node type effectivenodetyp
org apach jackrabbit core nodetyp node def nodedef
org apach jackrabbit core nodetyp node type conflict except nodetypeconflictexcept
org apach jackrabbit core nodetyp node type registri nodetyperegistri
org apach jackrabbit core nodetyp prop def propdef
org apach jackrabbit core state node state nodest
org apach jackrabbit core state properti state propertyst
org apach jackrabbit core intern internalvalu
org apach jackrabbit namespac resolv namespaceresolv
org apach jackrabbit prefix declar except noprefixdeclaredexcept
org apach jackrabbit path
org apach jackrabbit qname
org apach log4j logger
javax jcr properti type propertytyp
javax jcr repositori except repositoryexcept
javax jcr nodetyp constraint violat except constraintviolationexcept
java util hash set hashset
util class valid item constraint
definit
item valid itemvalid
logger instanc class
logger log logger logger getlogg item valid itemvalid
node type registri
node type registri nodetyperegistri reg ntreg
hierarchi manag gener error msg'
human readabl path
safegetjcrpath itemid
hierarchi manag hierarchymanag hier mgr hiermgr
namespac resolv gener error msg'
human readabl path
safegetjcrpath path
namespac resolv namespaceresolv resolv nsresolv
creat code itemvalid code instanc
param ntreg node type registri
param hiermgr hierarchi manag
param nsresolv namespac resolv
item valid itemvalid node type registri nodetyperegistri reg ntreg
hierarchi manag hierarchymanag hier mgr hiermgr
namespac resolv namespaceresolv resolv nsresolv
reg ntreg reg ntreg
hier mgr hiermgr hier mgr hiermgr
resolv nsresolv resolv nsresolv
check node state satisfi constraint
primari mixin node type valid check
perform
check node type satisfi 'requir node types' constraint
definit
check 'mandatory' child item exist
properti check properti satisfi
constraint property' definit
param nodest state node valid
throw constraintviolationexcept valid fail
throw repositoryexcept error occur
valid node state nodest node state nodest
constraint violat except constraintviolationexcept repositori except repositoryexcept
effect primari node type
effect node type effectivenodetyp ent primari entprimari
reg ntreg effect node type geteffectivenodetyp node state nodest node type getnodetypenam
effect node type primari type incl mixin
effect node type effectivenodetyp ent primari mixin entprimaryandmixin effect node type geteffectivenodetyp node state nodest
node def nodedef def reg ntreg node def getnodedef node state nodest definit getdefinitionid
check primari type satisfi 'requir node types' constraint
qname requir primari type requiredprimarytyp def requir primari type getrequiredprimarytyp
requir primari type requiredprimarytyp length
ent primari entprimari includ node type includesnodetyp requir primari type requiredprimarytyp
string msg safe jcr path safegetjcrpath node state nodest getid
miss requir primari type
requir primari type requiredprimarytyp
log debug msg
constraint violat except constraintviolationexcept msg
mandatori properti
prop def propdef pda ent primari mixin entprimaryandmixin mandatori prop def getmandatorypropdef
pda length
prop def propdef pda
node state nodest properti haspropertynam getnam
string msg safe jcr path safegetjcrpath node state nodest getid
mandatori properti getnam
exist
log debug msg
constraint violat except constraintviolationexcept msg
mandatori child node
node def nodedef cnda ent primari mixin entprimaryandmixin mandatori node def getmandatorynodedef
cnda length
node def nodedef cnd cnda
node state nodest child node entri haschildnodeentri cnd getnam
string msg safe jcr path safegetjcrpath node state nodest getid
mandatori child node cnd getnam
exist
log debug msg
constraint violat except constraintviolationexcept msg
check properti state satisfi constraint
definit valid check
perform
check type properti valu compli
requiredtyp property' definit
check properti valu satisfi constraint
property' definit
param propstat state properti valid
throw constraintviolationexcept valid fail
throw repositoryexcept error occur
valid properti state propertyst prop state propstat
constraint violat except constraintviolationexcept repositori except repositoryexcept
prop def propdef def reg ntreg prop def getpropdef prop state propstat definit getdefinitionid
intern internalvalu valu prop state propstat valu getvalu
type properti type propertytyp undefin
valu length
type properti type propertytyp undefin
type valu type gettyp
type valu type gettyp
constraint violat except constraintviolationexcept safe jcr path safegetjcrpath prop state propstat getid
inconsist type
def requir type getrequiredtyp properti type propertytyp undefin
def requir type getrequiredtyp type
constraint violat except constraintviolationexcept safe jcr path safegetjcrpath prop state propstat getid
requiredtyp constraint satisfi
effect node type effectivenodetyp check set properti constraint checksetpropertyvalueconstraint def valu
misc helper method
helper method build effect merg resolv
node type represent node' primari mixin
node type
param state
return effect node type
throw javax jcr repositoryexcept
effect node type effectivenodetyp effect node type geteffectivenodetyp node state nodest state
repositori except repositoryexcept
build effect node type mixin primari type
exist mixin'
hash set hashset set hash set hashset state mixin type name getmixintypenam
primari type
set add state node type getnodetypenam
qname name ntname qname set arrai toarrai qname set size
reg ntreg effect node type geteffectivenodetyp name ntname
node type conflict except nodetypeconflictexcept ntce
string msg
intern error fail build effect node type node
state uuid getuuid
log debug msg
repositori except repositoryexcept msg ntce
failsaf convers intern code path code jcr path
error messag
param path path convert
return jcr path
string safe jcr path safegetjcrpath path path
path jcr path tojcrpath resolv nsresolv
prefix declar except noprefixdeclaredexcept npde
log error fail convert path string tostr jcr path
return string represent intern path fallback
path string tostr
failsaf translat intern code itemid code jcr path
error messag
param translat
return jcr path
string safe jcr path safegetjcrpath item itemid
safe jcr path safegetjcrpath hier mgr hiermgr path getpath
repositori except repositoryexcept
log error fail build path
return string represent fallback
string tostr
