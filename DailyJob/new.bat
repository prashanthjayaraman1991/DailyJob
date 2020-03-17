set root="Z:\Workspaces_Eclipse\Workspace_Practice\DailyJob"
cd /d %root%
"cmd" /c "mvn compile exec:java -Dexec.mainClass="com.mainJobs.MainJobs" -Dexec.args="hello World1""
"cmd" /c "mvn compile exec:java -Dexec.mainClass="com.mainJobs.MainJobs" -Dexec.args="hello World2""
PAUSE