#!/bin/bash


echo "[INFO] Jmeter Execution START_TIME: `date`"
JMETER_START_TIME=$(($(date +%s) + 80));
echo  $(($(date +%s)));
echo  $(($(date +%s) + 80));

echo "[INFO] Jmeter Execution END_TIME: `date`"
JMETER_END_TIME=$(($(date +%s) - 80));
echo  $(($(date +%s)));
echo  $(($(date +%s) - 80));

echo "[INFO] Start time: ${JMETER_START_TIME}"
echo "[INFO] End time: ${JMETER_END_TIME}"

